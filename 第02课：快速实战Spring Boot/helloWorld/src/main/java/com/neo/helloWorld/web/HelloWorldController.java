package com.neo.helloWorld.web;

import com.neo.helloWorld.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/*
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello(String name) {
        return "Hello World," +name;

    }
    @GetMapping("/student/{id}")
    public Object getStudent(@PathVariable int id){
        Student student=new Student();
        student.setId(id);
        student.setAge(12);
        student.setName("david");
        student.setScore(100d);
        return  student;
    }
    @GetMapping("/somestudents")
    public Object getStudents(){
        List<Student> list=new ArrayList<Student>();
        for(int i=0;i<5;i++){
            Student student1=new Student();
            student1.setId(i+1);
            //student1.setAge(10+i);
            student1.setName("david"+i);
            student1.setScore(100d);
            list.add(student1);
        }
        return  list;
    }
}*/
