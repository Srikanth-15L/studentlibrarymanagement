package com.example.Student._Libraray_mangement;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity       //it is an entity or model class which directly represent the database schemas
@Table(name="student") // it will create a table in database
@Builder
public class Student {
    @Id //it is primary and not allow duplicate and unique ---no duplicate but not primarykey
    @Column(name="studentId",nullable=false
    )
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int studentId;

    @Column(name="student_name",nullable=false)
    private String studentname;

    @Column(name="studentemail",nullable=false)
    private String s_email;

    @Column(name="mobilenumber",nullable=true)
    private int mobileno;

    @Column(name="age",nullable=true)
    private int age;

    @Column(name="gender",nullable=false)
    private String gender;


    @JsonManagedReference
    @OneToOne(mappedBy="student",cascade=CascadeType.ALL)
     private Card card;




}
