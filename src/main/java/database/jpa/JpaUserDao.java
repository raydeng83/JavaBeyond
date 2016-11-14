package database.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by z00382545 on 11/8/16.
 */
public class JpaUserDao implements UserDao {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("hr");

    @Override
    public List<User> findAll() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<User> users = em.createQuery("select u from User u", User.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return users;
    }

    @Override
    public User findById(Integer id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        User user = em.find(User.class, id);
        em.getTransaction().commit();
        em.close();
        return user;
    }

    @Override
    public Integer save(User u) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
        em.close();
        return u.getId();
    }

    @Override
    public void delete(User u) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.find(User.class, u.getId()));
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Integer> getIds() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Integer> ids = em.createQuery("select u.id from User u", Integer.class)
                .getResultList();
        return ids;
    }
}
