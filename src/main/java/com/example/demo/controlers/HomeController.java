package com.example.demo.controlers;

import com.example.demo.entities.Form;
import com.example.demo.services.FormService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class HomeController {

    @Autowired
    private FormService FormService;

    @GetMapping(value="/")
    public String getHomePage(Model model) {
        Form newForm = new Form();
        
        model.addAttribute("form", newForm);
        return "HomeForm";
    }
    
    @PostMapping(value="/addForm")
    public String addForm(Form entity) {
        entity = FormService.saveForm(entity);
        return "Result";
    }
    
}