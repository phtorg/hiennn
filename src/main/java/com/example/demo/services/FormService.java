package com.example.demo.services;

import com.example.demo.entities.Form;
import com.example.demo.repositories.FormRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormService {
    @Autowired
    private FormRepository formRepository;

    public Form saveForm(Form formToSave){
        return formRepository.save(formToSave);
    }
}