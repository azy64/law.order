/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tunaweza.law.order.controller;

import com.tunaweza.law.order.model.Culprit;
import com.tunaweza.law.order.service.CulpritServiceInterface;
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
@RequestMapping("/culprit")
@AllArgsConstructor
@Getter
@Setter
public class CulpritController extends TunawezaRestController<Culprit> {

    private final CulpritServiceInterface culpritService;
    @GetMapping("/")
    @Override
    public String index() {
        return "@Culprit Controller page";
    }

    @GetMapping("/{id}")
    @Override
    public Culprit getOne(@PathVariable int id) {
        return culpritService.getOne(id);
    }

    @PostMapping("/save")
    @Override
    public Culprit add(@RequestBody Culprit culprit) {
        return culpritService.create(culprit);
    }

    @GetMapping("/all")
    @Override
    public List<Culprit> read() {
      return culpritService.read();
    }

    @PutMapping("/update/{id}")
    @Override
    public Culprit update(@RequestBody Culprit culprit,@PathVariable int id) {
        return culpritService.update(id, culprit);
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public Culprit delete(@PathVariable int id) {
        return culpritService.delete(id);
    }
    
}
