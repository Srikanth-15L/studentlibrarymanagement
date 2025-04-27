package com.example.Student._Libraray_mangement.RequestDto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AuthorRequestDto {

    private String Name;
    private String Country;
    private double rating;
    private int age;

}
