package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student s1 = new Student(
              "dave",
              "dave@dave.com",
                    LocalDate.of(2000, 10, 10),
                    21
            );

            Student s2 = new Student(
                    "armel",
                    "armel@dave.com",
                    LocalDate.of(2000, 10, 10),
                    21
            );

            studentRepository.saveAll(
                    List.of(s1, s2)
            );
        };
    }
}
