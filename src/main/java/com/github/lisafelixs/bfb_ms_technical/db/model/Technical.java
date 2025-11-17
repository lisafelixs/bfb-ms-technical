package com.github.lisafelixs.bfb_ms_technical.db.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "technical")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Technical {

    @Id
    @Column(name = "id", nullable = false, length = 36)
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "document_number", nullable = false, unique = true, length = 11)
    private String documentNumber;

    @Column(name = "phone_ddd",length = 3)
    private String phoneDDD;

    @Column(name = "phone_number",length = 10)
    private String phoneNumber;

    @Column(name = "status", nullable = false)
    private String status;

}
