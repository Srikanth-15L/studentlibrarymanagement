package com.example.Student._Libraray_mangement;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Author")
public class Author {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="Authorname")
    private String Name;
    @Column(name="country")
    private String Country;
    @Column(name="rating")
    private double rating;
    @Column(name="age")
    private int age;

    @JsonManagedReference
    @OneToMany(mappedBy="auth",cascade=CascadeType.ALL)
    private List<Book> bookSWrittenbyAuthor = new ArrayList<>();

}
