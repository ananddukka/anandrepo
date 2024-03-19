import org.springframework.beans.factory.annotation.Autowired.*;

import org.springframework.web.bind.annotation.*;

import java.util.*;

import com.example.school.model.Student;
import com.example.school.service.StudentH2Service;

@RestController  https://github.com/ananddukka/anandrepo.git
public class StudentController {
    @Autowired
    private StudentH2Service studentService;

    @GetMapping("/students")
    public ArrayList<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable("studentId") int studentId) {

    }

}

package com.example.school.model;

public class Student {

    private int studentId;

    private String studentName;

    private String gender;

    private int standard;

public Student(int studentId, String studentName, String gender, int standard) {

this.studentId= studentId;

this.studentName = studentName;

this.gender = gender;

this.standard = standard;

    public void setStudentId(int studentId) {

        this.studentId = studentId;

    }

    public int getStudentId() {
        return studentId;

    }

public void setStudentName (String studentName) {

}

    this.studentName=studentName;

}

public String getStudentName(){

return studentName;

}

    public void setGender(String gender) {

        this.gender = gender;

    }

    public String getGender() {

        return gender;

    }

    public void setStandard(int standard) {

        this.standard = standard;

    }

    public int getStandard() {

        return standard;

    }
}
