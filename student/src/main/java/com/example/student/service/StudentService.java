package com.example.student.service;

import com.example.student.model.Students;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Students> findAllStudents();
    Optional<Students> findById(long id);
    Students saveName(Students student);
    Students updateStudent(Students student);
    List<Students> findTopperOfClass(String field);

    void deleteStudent(long id);
}
