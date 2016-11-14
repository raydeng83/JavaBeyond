package database.jpa;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class JpaPersonDAOTest {
    private UserDao dao = new JpaUserDao();

    @Test
    public void findAll() throws Exception {
        List<User> people = dao.findAll();
        System.out.println(people);
        assertTrue(people.size() > 0);
    }

    @Test
    public void findById() throws Exception {
        System.out.println(dao.findById(2));
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