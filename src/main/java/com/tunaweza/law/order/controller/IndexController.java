/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tunaweza.law.order.controller;

import com.tunaweza.law.order.model.Judge;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import  com.tunaweza.law.order.model.Specialisation;
import java.util.Date;

/**
 *
 * @author azaria
 */
@Controller
@RestController
public class IndexController {
    @GetMapping("/index")
    public Judge index(){
        Specialisation specialisation = new Specialisation();
        
        specialisation.setLibelle("droit penale");
        specialisation.setCreatedAt(new Date());
        specialisation.setId(1L);
        Judge juge = new Judge(Long.MIN_VALUE, "Patrick", "Clerger","JUDGE#34556278", specialisation, new Date());
        
        return juge;
    }
}
