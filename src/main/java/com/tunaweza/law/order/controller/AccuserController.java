/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tunaweza.law.order.controller;

import com.tunaweza.law.order.model.Accuser;
import com.tunaweza.law.order.service.AccuserServiceInterface;
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
@RequestMapping("/Accuser")
@AllArgsConstructor
@Getter
@Setter
public class AccuserController extends TunawezaRestController<Accuser> {

    private final AccuserServiceInterface accuserService;
    @GetMapping("/")
    @Override
    public String index() {
      return "@AccuserController page";
    }

    @GetMapping("/{id}")
    @Override
    public Accuser getOne(@PathVariable int id) {
        return accuserService.getOne(id);
    }

    @PostMapping("/save")
    @Override
    public Accuser add(@RequestBody Accuser accuser) {
        return accuserService.create(accuser);
    }

    @GetMapping("/all")
    @Override
    public List<Accuser> read() {
        return accuserService.read();
    }

    @PutMapping("/update/{id}")
    @Override
    public Accuser update(@RequestBody Accuser accuser,@PathVariable int id) {
       return accuserService.update(id, accuser);
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public Accuser delete(@PathVariable int id) {
       return accuserService.delete(id);
    }
    
}
