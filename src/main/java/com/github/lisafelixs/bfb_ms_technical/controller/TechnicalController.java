package com.github.lisafelixs.bfb_ms_technical.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.lisafelixs.bfb_ms_technical.service.TechnicalService;

@RestController
@RequestMapping("/api/bfbmstechnical/v1/technical")
public class TechnicalController {

     @Autowired
     TechnicalService technicalService;

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getById(@PathVariable("id") String id) {
        return technicalService.getById(id);
    }
    
}
