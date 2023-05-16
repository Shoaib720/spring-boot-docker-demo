package com.example.springbootdocker.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<Object> homeController() {
        return ResponseEntity.ok().body("Service up and running");
    }
}
