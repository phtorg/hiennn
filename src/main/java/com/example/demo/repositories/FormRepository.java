package com.example.demo.repositories;

import java.math.BigDecimal;

import com.example.demo.entities.Form;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends CrudRepository<Form, BigDecimal> {
    
}