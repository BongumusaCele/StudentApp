package com.example.studentweb;

import com.example.studentweb.entity.Student;
import com.example.studentweb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentWebApplication.class, args);
    }

}
