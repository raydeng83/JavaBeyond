package database.jdbc;

import java.util.List;

/**
 * Created by z00382545 on 11/8/16.
 */
public interface UserDao {
    List<User> findAll();
    User findById(Integer id);
    Integer save(User u);
    void delete(User u);
    List<Integer> getIds();
}
