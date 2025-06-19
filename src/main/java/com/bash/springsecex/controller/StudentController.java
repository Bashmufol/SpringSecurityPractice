package com.bash.springsecex.controller;

import com.bash.springsecex.model.Student;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {
    List<Student> students = new ArrayList<>(Arrays.asList(
            new Student(1,"bash", 19),
            new Student(2,"samad", 15)
    ));

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }
//    @GetMapping("/csrftoken")
//    public CsrfToken getCsrfToken(HttpServletRequest request) {
//        return (CsrfToken) request.getAttribute("_csrf");
//    }
}
