package com.jpa.bookmanager.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Rest API 요청 받을 수 있음
public class HelloWorldController {
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "hello-world"; //여기서 new test (Ctrl + Shift + T)
    }
}
