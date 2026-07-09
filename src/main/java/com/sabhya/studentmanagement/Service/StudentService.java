package com.sabhya.studentmanagement.Service;

import com.sabhya.studentmanagement.entity.Student;
import com.sabhya.studentmanagement.repository.StudentRepository;
import org.springframework.stereotype.Service;
import com.sabhya.studentmanagement.exception.StudentNotFoundException;
import java.util.List;
import com.sabhya.studentmanagement.exception.DuplicateEmailException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    public List<Student> getStudentsByCourse(String course) {
        return studentRepository.findByCourseContainingIgnoreCase(course);
    }
    public long getStudentCount() {
        return studentRepository.count();
    }
    public Page<Student> getStudentsPage(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(
                page,
                size,
                Sort.by(sortBy).ascending()
        );

        return studentRepository.findAll(pageable);
    }
    public List<Student> searchStudentsByName(String name) {
        return studentRepository.findByNameContainingIgnoreCase(name);
    }
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));
    }

    public Student addStudent(Student student) {
        if (studentRepository.existsByEmail(student.getEmail())) {
            throw new DuplicateEmailException(student.getEmail());
        }

        return studentRepository.save(student);
    }
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
    public Student updateStudent(Long id, Student updatedStudent) {
        Student existingStudent = studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));

        existingStudent.setName(updatedStudent.getName());
        existingStudent.setEmail(updatedStudent.getEmail());
        existingStudent.setCourse(updatedStudent.getCourse());
        existingStudent.setPhone(updatedStudent.getPhone());

        return studentRepository.save(existingStudent);
    }
}