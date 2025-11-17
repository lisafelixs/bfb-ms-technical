package com.github.lisafelixs.bfb_ms_technical.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.lisafelixs.bfb_ms_technical.db.model.Technical;


public interface TechnicalRepository extends JpaRepository<Technical, String> {

}
