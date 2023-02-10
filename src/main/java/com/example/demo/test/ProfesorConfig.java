package com.example.demo.test;

import com.example.demo.student.Student;
import com.example.demo.student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Configuration
public class ProfesorConfig {

    @Bean
    CommandLineRunner commandLineRunner2(ProfesorRepository repository){
        return args -> {
            Profesor Aleksandar = new Profesor(
                    "Aleksandar",
                    "Planic",
                    "aleksandarplanic21@gmail.com",
                    21
            );
            Profesor Janko = new Profesor(
                    "Janko",
                    "Peric",
                    "jankoperic@gmail.com",
                    22
            );

            repository.saveAll(
                    List.of(Aleksandar,Janko)
            );
        };
    }
}
