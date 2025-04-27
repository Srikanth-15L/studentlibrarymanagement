package com.example.Student._Libraray_mangement.Service;

import com.example.Student._Libraray_mangement.Card;
import com.example.Student._Libraray_mangement.Converter.StudentConverter;
import com.example.Student._Libraray_mangement.Repository.StudentRepository;
import com.example.Student._Libraray_mangement.RequestDto.StudentRequestDto;
import com.example.Student._Libraray_mangement.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    //to save student it also save card for student

  public  void savestudent(StudentRequestDto st){
      Student student=StudentConverter.studentrequestdtointomodel(st);
      Card card =new Card();

      studentRepository.save(student);
  }
}
