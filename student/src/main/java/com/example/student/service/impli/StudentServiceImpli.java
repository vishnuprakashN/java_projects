package com.example.student.service.impli;


import com.example.student.model.Students;
import com.example.student.service.StudentService;
import com.example.student.studentrepo.StudentRepo;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpli implements StudentService {

    private final StudentRepo studentRepo;

    public StudentServiceImpli(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public List<Students> findAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Optional<Students> findById(long id) {
        return studentRepo.findById(id);
    }

    @Override
    public Students saveName(Students student) {
        return studentRepo.save(student);
    }

    @Override
    public Students updateStudent(Students student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Students> findTopperOfClass(String field) {
        return studentRepo.findAll(Sort.by(Sort.Direction.DESC,field));
    }

    @Override
    public void deleteStudent(long id) {
        studentRepo.deleteById(id);
    }
}
