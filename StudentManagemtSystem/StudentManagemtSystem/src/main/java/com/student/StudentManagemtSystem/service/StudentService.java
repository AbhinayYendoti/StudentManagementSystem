package com.student.StudentManagemtSystem.service;

public interface StudentService {
    StudentInfoEntity createStudent(StudentInfoEntity studentInfoEntity);
    StudentInfoEntity updateStudent(StudentInfoEntity studentInfoEntity, Long studentId);
    void deleteStudent(Long studentId);
    StudentInfoEntity getStudentById(Long studentId);
    List<StudentInfoEntity> getAllStudents();
}
