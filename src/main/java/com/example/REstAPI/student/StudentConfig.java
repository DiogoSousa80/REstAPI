package com.example.REstAPI.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {



    @Bean
    <StudentRepository>
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student diogo = new Student(
                    1L,
                    "Diogo",
                    "sousadiogo453@gmail.com",
                    LocalDate.of(1995, Month.FEBRUARY, 8)

            );
            Student alex = new Student(
                    "Alex",
                    "alex453@gmail.com",
                    LocalDate.of(2000, Month.FEBRUARY, 7)

            );
           repository.toString(
           );

        };
    }
}
