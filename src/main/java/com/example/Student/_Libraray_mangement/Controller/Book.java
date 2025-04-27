package com.example.Student._Libraray_mangement.Controller;

import com.example.Student._Libraray_mangement.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Book")
public class Book {
   // @Autowired
    //private BookService bookservice;
   /* @PostMapping("/save/book")
    public String saveBook(@RequestBody BookRequestDto bookreqDto){
            String s=bookservice.saveBook(bookreqDto);
            return s;
    }

    */
}
