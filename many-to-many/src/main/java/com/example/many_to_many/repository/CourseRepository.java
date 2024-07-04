package com.example.many_to_many.repository;

import com.example.many_to_many.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
