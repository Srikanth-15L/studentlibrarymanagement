package com.example.Student._Libraray_mangement.Converter;

import com.example.Student._Libraray_mangement.RequestDto.StudentRequestDto;
import com.example.Student._Libraray_mangement.Student;

public class StudentConverter {
    //converts the request dto into model classes
    public static Student  studentrequestdtointomodel(StudentRequestDto strequestdto){
        Student student=Student.builder().studentname(strequestdto.getStudentName()).age(strequestdto.getAge())
                .mobileno(strequestdto.getMobileNo())
                .s_email(strequestdto.getS_email())
                .gender(strequestdto.getGender()).build();
        return student;
//builder create the object in the heap
    }
}
