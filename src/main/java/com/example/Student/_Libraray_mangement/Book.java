package com.example.Student._Libraray_mangement;

import com.example.Student._Libraray_mangement.Enums.Genre;
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
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="bookid")
    private int bookid;

    @Column(name="pages")
    private int pages;

    @Column(name="differentGeneres")
    @Enumerated(value=EnumType.STRING)
    private Genre genre;//type of book horror ,comedy -fixed values so create enum

    @Column(name="title")
    private String title;


    @Column(name="quantity")
    private int quantity;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn
    private Author auth;//many to one



    @JsonManagedReference
    @OneToMany(mappedBy="book",cascade=CascadeType.ALL)
    private List<Transaction>  Transaction = new ArrayList<>();

    @JsonManagedReference
    @ManyToOne
    @JoinColumn
    private Card card;








}
