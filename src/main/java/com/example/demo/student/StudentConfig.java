package com.example.demo.student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Aleksandar = new Student(
                    "Aleksandar",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    "aleksandarplanic21@gmail.com",
                    21
            );
            Student Janko = new Student(
                    "Janko",
                    LocalDate.of(2001, Month.FEBRUARY, 11),
                    "jankoperic@gmail.com",
                    22
            );

            repository.saveAll(
                    List.of(Aleksandar,Janko)
            );
        };
    }
}
