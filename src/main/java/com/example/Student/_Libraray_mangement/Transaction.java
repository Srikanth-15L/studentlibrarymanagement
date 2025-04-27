package com.example.Student._Libraray_mangement;


import com.example.Student._Libraray_mangement.Enums.TransactionName;
import com.example.Student._Libraray_mangement.Enums.TransactionStatus;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="transactions")
    @Enumerated(value=EnumType.STRING)
    private TransactionName transactionname;
    @Column(name="transactionstatus")
    @Enumerated(value=EnumType.STRING)
    private TransactionStatus transactionStatus;
    @Column(name="fine")
    private double fine;
    @Column(name="transactiondate")
    @CreationTimestamp
    private Date transactiondate;
    @Column(name="transactionsexpiry")
    private Date transactionExpiry;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn
    private Book book;

     @JsonManagedReference
     @ManyToOne
     @JoinColumn
     private Card cardtransaction;

}
