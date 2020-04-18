package com.bulut.deneme.cache.controller;

import com.bulut.deneme.cache.dto.SampleDTO;
import com.bulut.deneme.cache.service.DataGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cache")
public class CacheTestController {

    @Autowired
    DataGeneratorService dataGeneratorService;

    @GetMapping("")
    public ResponseEntity getDemoData() {
        return new ResponseEntity<>(dataGeneratorService.getSampleData(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity addDemoData(@RequestBody SampleDTO sampleDTO) {
        return new ResponseEntity<>(dataGeneratorService.save(sampleDTO), HttpStatus.OK);

    }

    @PutMapping("")
    public ResponseEntity updateDemoData(@RequestBody SampleDTO sampleDTO) {
        return new ResponseEntity<>(dataGeneratorService.update(sampleDTO), HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteDemoData(@PathVariable long id) {
        dataGeneratorService.delete(id);
        return new ResponseEntity<>("deleted", HttpStatus.OK);

    }

}
