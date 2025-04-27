package com.example.Student._Libraray_mangement.Repository;

import com.example.Student._Libraray_mangement.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TransactionRep  extends JpaRepository<Transaction,Integer> {
}
