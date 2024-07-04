package com.example.many_to_many.repository;

import com.example.many_to_many.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
