package com.popov.aws.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AwsController {

    @GetMapping("/home")
    public String get() {
        return "index";
    }
}
