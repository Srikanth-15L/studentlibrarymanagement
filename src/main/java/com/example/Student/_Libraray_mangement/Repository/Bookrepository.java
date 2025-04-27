package com.example.Student._Libraray_mangement.Repository;

import com.example.Student._Libraray_mangement.Controller.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bookrepository extends JpaRepository<Book,Integer>{
}
