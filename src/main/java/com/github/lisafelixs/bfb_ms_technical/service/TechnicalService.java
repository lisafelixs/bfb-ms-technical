package com.github.lisafelixs.bfb_ms_technical.service;

import org.springframework.http.ResponseEntity;


public interface TechnicalService {

    ResponseEntity<Object> getById(String id);
}
