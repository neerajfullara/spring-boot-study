package com.practiceWebPage.firstDemoWeb.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class HomePageController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome Neeraj!";
    }

    @RequestMapping("/about")
    public String about(){
        return "Its me JVM";
    }
}
