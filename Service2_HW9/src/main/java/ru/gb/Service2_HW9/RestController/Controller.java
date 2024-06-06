package ru.gb.Service2_HW9.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service2")
public class Controller {

    @GetMapping("/hello")
    public String hello(){
        return "Hello from service2";
    }
}
