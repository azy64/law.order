/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tunaweza.law.order.controller;

import com.tunaweza.law.order.model.CulpritDefender;
import com.tunaweza.law.order.service.CulpritDefenderServiceInterface;
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
@RequestMapping("/defender")
@Getter
@Setter
@AllArgsConstructor
public class CulpritDefenderController extends TunawezaRestController<CulpritDefender> {

    private final CulpritDefenderServiceInterface defenderService;
    @GetMapping("/")
    @Override
    public String index() {
        return "@CulpritDefenderController page";
    }

    @GetMapping("/{id}")
    @Override
    public CulpritDefender getOne(@PathVariable int id) {
        return defenderService.getOne(id);
    }

    @PostMapping("/save")
    @Override
    public CulpritDefender add(@RequestBody CulpritDefender entity) {
        return defenderService.create(entity);
    }

    @GetMapping("/all")
    @Override
    public List<CulpritDefender> read() {
        return defenderService.read();
    }

    @PutMapping("/update/{id}")
    @Override
    public CulpritDefender update(@RequestBody CulpritDefender entity,@PathVariable int id) {
        return defenderService.update(id, entity);
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public CulpritDefender delete(@PathVariable int id) {
        return defenderService.delete(id);
    }
    
}
