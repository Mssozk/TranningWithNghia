package org.java.demo.repository;

import org.java.demo.model.Project;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ProjectRepository extends SimpleJpaRepository<Project, Integer> {

    EntityManager em;

    public ProjectRepository(EntityManager em) {
        super(Project.class, em);
        this.em = em;
    }

    public int deleteById(int id) {
        Query q = em.createNativeQuery("UPDATE project SET status = '1' WHERE id = :variableName", Project.class)
                .setParameter("variableName", id);
        return q.executeUpdate();
    }

    public Project findById(int id) {
        Query q = em.createNativeQuery("SELECT * FROM project WHERE id LIKE :variableName", Project.class)
                .setParameter("variableName", id);
        return (Project) q.getSingleResult();
    }
}
