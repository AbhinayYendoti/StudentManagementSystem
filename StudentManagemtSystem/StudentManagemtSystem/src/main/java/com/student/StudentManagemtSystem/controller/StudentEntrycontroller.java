package com.student.StudentManagemtSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentEntryController {

    @Autowired
    private StudentService studentService;

    // Create a new student
    @PostMapping("/createStudent")
    public StudentInfoEntity createStudent(@RequestBody StudentInfoEntity studentInfoEntity) {
        return studentService.createStudent(studentInfoEntity);
    }

    // Update an existing student
    @PutMapping("/updateStudent/{id}")
    public StudentInfoEntity updateStudent(@PathVariable(value = "id") Long studentId, @RequestBody StudentInfoEntity studentInfoEntity) {
        return studentService.updateStudent(studentInfoEntity, studentId);
    }

    // Delete a student
    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable(value = "id") Long studentId) {
        studentService.deleteStudent(studentId);
        return "Student Deleted Successfully";
    }

    // Get a student by ID
    @GetMapping("/getStudent/{id}")
    public StudentInfoEntity getStudent(@PathVariable(value = "id") Long studentId) {
        return studentService.getStudentById(studentId);
    }

    // Get all students
    @GetMapping("/getAllStudents")
    public List<StudentInfoEntity> getAllStudents() {
        return studentService.getAllStudents();
    }
}
