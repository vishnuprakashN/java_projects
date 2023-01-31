package com.example.student.controller;

import com.example.student.model.Students;
import com.example.student.service.StudentService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/studentslist")
    public List<Students> findAllStudents(){
        return studentService.findAllStudents();
    }

    @GetMapping("/{id}")
    public Optional<Students> findStudentsId(@PathVariable("id") Long Id){
        return studentService.findById(Id);
    }

    @GetMapping("/top/{field}")
    public List<Students> findTopperOfClass(@PathVariable("field") String field){
        List<Students> studentsList = studentService.findTopperOfClass(field);
        return studentsList;
    }

    @PostMapping("/saveinfo")
    public Students saveStudents(@RequestBody Students students){
        return studentService.saveName(students);
    }

    @PutMapping("/update")
    public Students updateStudents(@RequestBody Students students){
        return studentService.updateStudent(students);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") Long ID){
        studentService.deleteStudent(ID);
    }

}
