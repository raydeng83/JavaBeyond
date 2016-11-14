package database.jdbc;

import database.jpa.*;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class JdbcPersonDAOTest {
    private UserDao dao = new JdbcUserDao();

    @Test
    public void findAll() throws Exception {
        List<User> user = dao.findAll();
        System.out.println(user);
        assertTrue(user.size() > 0);
    }

    @Test
    public void findById() throws Exception {
        System.out.println(dao.findById(1));
        for (int id : dao.getIds()) {
            assertNotNull(dao.findById(id));
        }
    }

    @Test
    public void save() throws Exception {
        User u = new User("ldeng");
        int generatedId = dao.save(u);
        assertNotNull(dao.findById(generatedId));
    }

    @Test
    public void delete() {
        int maxId = dao.getIds().stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(1);
        System.out.println("maxId=" + maxId);
        User u = dao.findById(maxId);
        dao.delete(u);
        assertNull(dao.findById(maxId));
    }


    @Test
    public void getIds() {
        System.out.println(dao.getIds());
    }
}