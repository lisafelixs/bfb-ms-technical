package com.github.lisafelixs.bfb_ms_technical.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TechnicalResponseDTO {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("email")
    private String email;

    @JsonProperty("document_number")   
    private String documentNumber;

    @JsonProperty("phone_ddd")
    private String phoneDDD;

    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("status")
    private String status;
    
}
