package com.example.Student._Libraray_mangement.RequestDto;

import jakarta.persistence.Column;
import lombok.Data;
import com.example.Student._Libraray_mangement.
@Data
public class StudentRequestDto {

    private String studentName;


    private String s_email;


    private int mobileNo;
    private int age;


    private String gender;
}
