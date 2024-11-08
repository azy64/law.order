/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tunaweza.law.order.service;

import com.tunaweza.law.order.model.Culprit;
import com.tunaweza.law.order.repository.CulpritRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author azaria
 */
@Service
@AllArgsConstructor
public class CulpritService implements CulpritServiceInterface {

    private final CulpritRepository culpritRepository;
    
    @Override
    public List<Culprit> read() {
        return culpritRepository.findAll();
    }

    @Override
    public Culprit getOne(int id) {
        return culpritRepository.findById(id).get();
    }

    @Override
    public Culprit create(Culprit culprit) {
       culpritRepository.save(culprit);
       return culprit;
    }

    @Override
    public Culprit update(int id, Culprit culprit) {
        Culprit cul = culpritRepository.findById(id).get();
        cul.setAddress(culprit.getAddress());
        cul.setDateOfBirth(culprit.getDateOfBirth());
        cul.setLastname(culprit.getLastname());
        cul.setName(culprit.getName());
        cul.setMaritalStatus(culprit.getMaritalStatus());
        cul.setOccupation(culprit.getOccupation());
        culpritRepository.save(cul);
        return cul;
    }

    @Override
    public Culprit delete(int id) {
        Culprit cul =culpritRepository.findById(id).get();
        culpritRepository.delete(cul);
        return cul;
    }
    
}
