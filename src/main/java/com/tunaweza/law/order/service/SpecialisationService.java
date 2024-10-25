/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tunaweza.law.order.service;

import com.tunaweza.law.order.repository.SpecialisationRepository;
import com.tunaweza.law.order.model.Specialisation;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author azaria
 */

@Service
@AllArgsConstructor
public class SpecialisationService implements SpecialisationServiceInterface {
    @Autowired
    private final SpecialisationRepository specialisationRepository;

    @Override
    public List<Specialisation> read() {
       return specialisationRepository.findAll();
    }

    @Override
    public Specialisation create(Specialisation specialisation) {
        specialisationRepository.save(specialisation);
        return specialisation;
    }

    @Override
    public Specialisation update(int id, Specialisation entity) {
        Specialisation spec =(Specialisation)entity;
        Specialisation target = (Specialisation) specialisationRepository.findById(id).get();
        target.setLibelle(spec.getLibelle());
        target.setCreatedAt(spec.getCreatedAt());
        specialisationRepository.save(target);
        return target;
    }

    @Override
    public Specialisation delete(int id) {
        Specialisation target = (Specialisation) specialisationRepository.findById(id).get();
        specialisationRepository.delete(target);
        return target;
    }

    @Override
    public Specialisation getOne(int id) {
        Specialisation target = (Specialisation) specialisationRepository.findById(id).get();
        return target;
    }
    
}
