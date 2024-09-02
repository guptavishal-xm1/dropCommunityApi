package com.dropearn.earndropapi.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class errorController implements ErrorController {
    @GetMapping("/error")
    public String error() {
        return "error";
    }
}
