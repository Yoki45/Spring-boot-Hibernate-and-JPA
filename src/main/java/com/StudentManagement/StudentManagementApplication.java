package com.StudentManagement;

import com.StudentManagement.models.*;
import com.StudentManagement.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

        //Student student1 = new Student("Mashallah", "Inshallah", "inshallah@gmail.com");
       // studentRepository.save(student1);

       // Student student2 = new Student("Ogwang", "Fumbe", "Ofumbe@gmail.com");
        //studentRepository.save(student2);

        //Student student3 = new Student("tony", "stark", "tony@gmail.com");
        //studentRepository.save(student3);


    }
}
