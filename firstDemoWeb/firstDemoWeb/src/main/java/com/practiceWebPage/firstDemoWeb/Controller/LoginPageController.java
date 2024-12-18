package com.practiceWebPage.firstDemoWeb.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginPageController {

    @RequestMapping("/login")
    public String login(){
        return "This is Login Page";
    }
}
