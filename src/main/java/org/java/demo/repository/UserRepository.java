package org.java.demo.repository;

import org.java.demo.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserRepository extends SimpleJpaRepository<User, Integer> {

    EntityManager em;

    public UserRepository(EntityManager em) {
        super(User.class, em);
        this.em = em;
    }

    public int deleteById(int id) {
        Query q = em.createNativeQuery("UPDATE user SET status = '1' WHERE id = :variableName", User.class)
                .setParameter("variableName", id);
        return q.executeUpdate();
    }

    public User findById(int id) {
        Query q = em.createNativeQuery("SELECT * FROM user WHERE id LIKE :variableName", User.class)
                .setParameter("variableName", id);
        return (User) q.getSingleResult();
    }
}
