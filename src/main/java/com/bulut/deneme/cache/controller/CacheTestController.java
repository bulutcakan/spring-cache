package com.bulut.deneme.cache.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cache")
public class CacheTestController {

    @GetMapping("")
    public ResponseEntity getDemoData()
    {
        return null;

    }

}
