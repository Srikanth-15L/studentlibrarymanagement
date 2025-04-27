package com.example.Student._Libraray_mangement.Repository;

import com.example.Student._Libraray_mangement.Controller.Student;
import com.example.Student._Libraray_mangement.Service.StudentService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
