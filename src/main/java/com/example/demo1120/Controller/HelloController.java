package com.example.demo1120.Controller;


import com.example.demo1120.Bean.Student;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam("name")String name,@RequestParam("age")Integer age){
        return name+age;
    }


    @PostMapping("/hello")
    public String hello1(@RequestBody Student student){
        return student.toString();
    }
}
