package com.example.Student._Libraray_mangement;

import com.example.Student._Libraray_mangement.Enums.CardStatus;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Card")
public class Card {
    @Id

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="createddate")
    @CreationTimestamp //when card gets created it will add the time automatically from the system

    private Date Createdate;
    @UpdateTimestamp //when card gets created it will add the time automatically from the system

    @Column(name="updatedDate")
    private Date updatedate;

    @Column(name="cardStatus")
    @Enumerated(value= EnumType.STRING)
    private CardStatus cardstatus; // it contain only fixed values - Active Deactive Blocked Expired


    @OneToOne
    @JoinColumn
    private Student student;

   @JsonManagedReference
    @OneToMany(mappedBy="card",cascade=CascadeType.ALL)
   private List<Book> booksAssignedToCard = new ArrayList<>();

   @JsonManagedReference
   @OneToMany(mappedBy="cardtransaction",cascade=CascadeType.ALL)
    private List<Transaction> listtransaction = new ArrayList<>();











}
