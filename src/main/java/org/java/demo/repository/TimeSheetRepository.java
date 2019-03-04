package org.java.demo.repository;

import org.java.demo.model.TimeSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class TimeSheetRepository extends SimpleJpaRepository<TimeSheet, Integer> {

    EntityManager em;

    public TimeSheetRepository(EntityManager em) {
        super(TimeSheet.class, em);
        this.em = em;
    }




//
//
//
//
//
//    public int deleteById(int id) {
//        Query q = em.createNativeQuery("UPDATE timesheet SET status = '1' WHERE id = :variableName", TimeSheet.class)
//                .setParameter("vairableName", id);
//        return q.executeUpdate();
//    }
//
//    public TimeSheet findById(int id) {
//        Query q = em.createNativeQuery("SELECT * FROM user WHERE id LIKE :variableName", TimeSheet.class)
//                .setParameter("variableName", id);
//        return (TimeSheet) q.getSingleResult();
//    }

}

