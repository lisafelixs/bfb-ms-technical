package com.github.lisafelixs.bfb_ms_technical.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.github.lisafelixs.bfb_ms_technical.db.model.Technical;
import com.github.lisafelixs.bfb_ms_technical.db.repository.TechnicalRepository;
import com.github.lisafelixs.bfb_ms_technical.dto.ApiResponse;
import com.github.lisafelixs.bfb_ms_technical.dto.TechnicalResponseDTO;
import com.github.lisafelixs.bfb_ms_technical.service.TechnicalService;

public class TechnicalServiceImpl implements TechnicalService {

    @Autowired
    TechnicalRepository technicalRepository;

    @Override
    public ResponseEntity<Object> getById(String id) {

        Optional<Technical> response = technicalRepository.findById(id);

        if (response.isPresent()) {
            Technical technical = response.get();
            TechnicalResponseDTO responseDto = new TechnicalResponseDTO();
            responseDto.setId(technical.getId());
            responseDto.setName(technical.getName());
            responseDto.setEmail(technical.getEmail());
            responseDto.setDocumentNumber(technical.getDocumentNumber());
            responseDto.setPhoneDDD(technical.getPhoneDDD()!=null ? technical.getPhoneDDD() : "");
            responseDto.setPhoneNumber(technical.getPhoneNumber()!=null ? technical.getPhoneNumber() : "");
            responseDto.setStatus(technical.getStatus());
            return ResponseEntity.ok(responseDto);
        }

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(ApiResponse.error(HttpStatus.NOT_FOUND, "Technical not found"));
    }
}