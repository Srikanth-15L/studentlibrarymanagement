package com.example.Student._Libraray_mangement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Card extends JpaRepository<Card,Integer> {
}
