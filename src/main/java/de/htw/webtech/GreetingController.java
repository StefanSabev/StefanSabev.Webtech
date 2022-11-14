package de.htw.webtech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld";
    }
    @GetMapping("/")
    public String helloW(){
        return "HelloWorld";
    }

}
