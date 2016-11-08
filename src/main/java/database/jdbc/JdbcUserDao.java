package database.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by z00382545 on 11/8/16.
 */
public class JdbcUserDao implements UserDao {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/hr";
    private static final String USER = "root";
    private static final String PASSWORD = "Rochester24";

    public JdbcUserDao() {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        try (
                Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement pst = conn.prepareStatement("SELECT * FROM hr.PEOPLE")
        ) {
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                users.add(new User(rs.getInt(1), rs.getString(2)));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;

    }

    @Override
    public User findById(Integer id) {
        User u = null;
        try (
                Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement pst = conn.prepareStatement(
                        "SELECT * FROM hr.PEOPLE WHERE id=?")
        ) {
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                u = new User(id, rs.getString("name"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u;
    }

    @Override
    public Integer save(User u) {
        int generatedKey = 0;
        try (
                Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement pst = conn.prepareStatement(
                        "INSERT INTO hr.PEOPLE(name) VALUES(?)",
                        Statement.RETURN_GENERATED_KEYS)
        ) {
            pst.setString(1, u.getName());
            int uc = pst.executeUpdate();
            if (uc != 1) throw new SQLException("No rows added");

            try (ResultSet keys = pst.getGeneratedKeys()) {
                if (keys.next()) {
                    generatedKey = keys.getInt(1);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return generatedKey;
    }

    @Override
    public void delete(User u) {
        try (
                Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement pst = conn.prepareStatement(
                        "DELETE FROM hr.PEOPLE WHERE id=?")
        ) {
            pst.setInt(1, u.getId());
            int uc = pst.executeUpdate();
            if (uc != 1) throw new SQLException("No rows removed");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Integer> getIds() {
        List<Integer> ids = new ArrayList<>();
        try (
                Connection conn = DriverManager.getConnection(URL,USER, PASSWORD);
                PreparedStatement pst = conn.prepareStatement("select id from hr.PEOPLE");
        ) {
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ids.add(rs.getInt(1));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ids;
    }
}
