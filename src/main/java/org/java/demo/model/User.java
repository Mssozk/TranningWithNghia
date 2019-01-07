package org.java.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int companyId;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private String gender;

    @Column
    private String department;

    @Column
    private Short status; // FREE, NEW_USER, DELETED,

}
