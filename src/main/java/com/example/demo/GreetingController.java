package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @GetMapping("/say-hello")
    @ResponseBody
    public String sayHello(@RequestParam(name = "name", required = true) String name){
//        return new Greeting("Hello ".concat(name));
        return "Hello ".concat(name);
    }
}
