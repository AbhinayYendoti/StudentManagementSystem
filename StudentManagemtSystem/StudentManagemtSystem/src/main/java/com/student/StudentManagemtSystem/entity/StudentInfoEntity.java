package com.student.StudentManagemtSystem.entity;


import org.springframework.boot.autoconfigure.domain.EntityScan;

public class StudentInfoEntity {
    @EntityScan
    @Table(name = "students")
    public class StudentInfoEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        private String email;
        private String course;

        // Getters and Setters
    }

}
