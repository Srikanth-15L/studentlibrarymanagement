package com.example.Student._Libraray_mangement.Repository;

import com.example.Student._Libraray_mangement.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
