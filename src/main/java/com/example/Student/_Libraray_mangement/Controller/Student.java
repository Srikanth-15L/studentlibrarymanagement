package com.example.Student._Libraray_mangement.Controller;

import com.example.Student._Libraray_mangement.RequestDto.StudentRequestDto;
import com.example.Student._Libraray_mangement.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")
public class Student {
    @Autowired
    private StudentService service;
    @PostMapping("/Student")
    public void SaveStudent(@RequestBody StudentRequestDto StudentDto){
        service.savestudent(StudentDto);

    }



}
