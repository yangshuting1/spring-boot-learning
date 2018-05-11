package com.sugar.springbootlearning.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/index")
    public String first(){
        return "hello world: spring boot";
    }


}
