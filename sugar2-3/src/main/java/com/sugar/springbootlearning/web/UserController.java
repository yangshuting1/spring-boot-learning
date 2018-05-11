package com.sugar.springbootlearning.web;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @ApiOperation("哈哈")
    public String first(){
        return "hello world: spring boot";
    }
}
