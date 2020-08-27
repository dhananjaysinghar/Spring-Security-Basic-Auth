package com.ba.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test-admin")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String helloMessage() {
        return "Hello ADMIN!!";
    }

    @GetMapping("/test-user")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_USER')")
    public String helloMessage1() {
        return "Hello USER!!";
    }
}
