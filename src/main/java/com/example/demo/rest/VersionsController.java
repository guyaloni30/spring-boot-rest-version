package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/users", produces = "application/json")
public class VersionsController {
    @GetMapping
    public int unversioned() {
        return 10000;
    }
    @GetMapping(headers = "x-api-version=1")
    public int v1() {
        return 1;
    }

    @GetMapping(headers = "x-api-version=2")
    public int v2() {
        return 2;
    }
}
