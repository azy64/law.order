/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tunaweza.law.order.controller;

import com.tunaweza.law.order.model.Judge;
import com.tunaweza.law.order.service.JudgeServiceInterface;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author azaria
 */
@RestController
@RequestMapping("/judge")
@Getter
@Setter
@AllArgsConstructor
public class JudgeControler extends TunawezaRestController<Judge> {
    
    private final JudgeServiceInterface judgeService;

    @GetMapping("/")
    @Override
    public String index() {
        return "Judge page";
    }

    @GetMapping("/{id}")
    @Override
    public Judge getOne(@PathVariable int id) {
        return judgeService.getOne(id);
    }

    @PostMapping("/save")
    @Override
    public Judge add(@RequestBody Judge judge) {
        return judgeService.create(judge);
    }

    @GetMapping("/all")
    @Override
    public List<Judge> read() {
        return judgeService.read();
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public Judge delete(@PathVariable int id) {
       return judgeService.delete(id);
    }

    @PutMapping("/update/{id}")
    @Override
    public Judge update(@RequestBody Judge entity,@PathVariable int id) {
        return judgeService.update(id, entity);
    }
    
}
