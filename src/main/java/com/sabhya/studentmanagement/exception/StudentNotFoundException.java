package com.sabhya.studentmanagement.exception;

public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(Long id) {
        super("Student with ID " + id + " was not found");
    }
}