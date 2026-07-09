package com.sabhya.studentmanagement.repository;

import com.sabhya.studentmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    boolean existsByEmail(String email);
    List<Student> findByNameContainingIgnoreCase(String name);
    List<Student> findByCourseContainingIgnoreCase(String course);
}