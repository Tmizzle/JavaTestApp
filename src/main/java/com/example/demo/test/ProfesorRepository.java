package com.example.demo.test;

import com.example.demo.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Long> {

    @Query("SELECT s FROM Profesor s WHERE s.email= ?1")
    Optional<Profesor> findStudentByEmail(String email);
}
