/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tunaweza.law.order.controller;

import com.tunaweza.law.order.repository.SpecialisationRepository;
import com.tunaweza.law.order.model.Specialisation;
import com.tunaweza.law.order.service.EntityService;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tunaweza.law.order.service.SpecialisationService;

/**
 *
 * @author azaria
 */

@RestController
@RequestMapping("/specialisation")
@Getter
@Setter
@AllArgsConstructor
public class SpecialisationController {
    //
    private final EntityService specialisationService;
    
    @GetMapping("/")
    public String index(){
        return "Je suis la page Acceuil";
    }
    
    
    @PostMapping("/save")
    public Specialisation add(@RequestBody Specialisation specialisation){
        specialisationService.create(specialisation);
        return specialisation;
    }
    
    
    @GetMapping("/read")
    public List<Specialisation> read(){
        return specialisationService.read();
    }
    
    @DeleteMapping("/delete/{id}")
    public Specialisation delete(@PathVariable int id){
        return (Specialisation) specialisationService.delete(id);
    }

}
