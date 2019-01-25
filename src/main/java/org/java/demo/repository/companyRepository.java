package org.java.demo.repository;

import org.java.demo.model.Company;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class CompanyRepository extends SimpleJpaRepository {

    EntityManager em;

    public CompanyRepository(EntityManager em) {
        super(Company.class, em);
        this.em = em;
    }

    public int deleteById(int id) {
        Query q = em.createNativeQuery("UPDATE company SET status = '1' WHERE id = :variableName", Company.class)
                .setParameter("variableName", id);
        return q.executeUpdate();
    }

    public Company findById(int id) {
        Query q = em.createNativeQuery("SELECT * FROM company WHERE id LIKE :variableName", Company.class)
                .setParameter("variableName", id);
        return (Company) q.getSingleResult();
    }
}
