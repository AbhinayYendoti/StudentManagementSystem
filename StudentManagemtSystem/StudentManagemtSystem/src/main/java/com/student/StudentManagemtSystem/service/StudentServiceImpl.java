package com.student.StudentManagemtSystem.service;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentInfoEntity createStudent(StudentInfoEntity studentInfoEntity) {
        return studentRepository.save(studentInfoEntity);
    }

    @Override
    public StudentInfoEntity updateStudent(StudentInfoEntity studentInfoEntity, Long studentId) {
        StudentInfoEntity existingStudent = studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id " + studentId));
        existingStudent.setName(studentInfoEntity.getName());
        existingStudent.setEmail(studentInfoEntity.getEmail());
        existingStudent.setCourse(studentInfoEntity.getCourse());
        return studentRepository.save(existingStudent);
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }

    @Override
    public StudentInfoEntity getStudentById(Long studentId) {
        return studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id " + studentId));
    }

    @Override
    public List<StudentInfoEntity> getAllStudents() {
        return studentRepository.findAll();
    }
}
