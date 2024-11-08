/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tunaweza.law.order.controller;

import com.tunaweza.law.order.model.BurdenFile;
import com.tunaweza.law.order.service.BurdenFileServiceInterface;
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
@RequestMapping("/burden-file")
@Getter
@Setter
@AllArgsConstructor
public class BurdenFileController extends TunawezaRestController<BurdenFile> {

    private final BurdenFileServiceInterface burdenFileService;
    @GetMapping("/")
    @Override
    public String index() {
       return"@BurderFileController page";
    }

    @GetMapping("/{id}")
    @Override
    public BurdenFile getOne(@PathVariable int id) {
        return burdenFileService.getOne(id);
    }

    @PostMapping("/save")
    @Override
    public BurdenFile add(@RequestBody BurdenFile burdenFile) {
       return burdenFileService.create(burdenFile);
    }

    @GetMapping("/all")
    @Override
    public List<BurdenFile> read() {
       return burdenFileService.read();
    }

    @PutMapping("/update/{id}")
    @Override
    public BurdenFile update(@RequestBody BurdenFile entity, @PathVariable int id) {
      return burdenFileService.update(id, entity);
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public BurdenFile delete(@PathVariable int id) {
        return burdenFileService.delete(id);
    }
    
}
