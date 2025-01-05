package com.student.StudentManagemtSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthcheck {
    @GetMapping("/healthcheck")
    public String Healthch(){
        return "ok";
    }

}
