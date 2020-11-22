package com.market.controller;

import com.market.model.Student;
import com.market.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping("getall")
    public String getall(){
        List<Student> list=studentService.getAllStudent();
        String res="all students:";
        for(Student stu : list){
            res+="$["+stu.toString()+"]";
        }
        return res;
    }
}
