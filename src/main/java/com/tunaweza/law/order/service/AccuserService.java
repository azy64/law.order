/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tunaweza.law.order.service;

import com.tunaweza.law.order.model.Accuser;
import com.tunaweza.law.order.repository.AccuserRepository;
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
public class AccuserService implements AccuserServiceInterface {

    private final AccuserRepository accuserRepository;
    @Override
    public List<Accuser> read() {
        return accuserRepository.findAll();
    }

    @Override
    public Accuser getOne(int id) {
        return accuserRepository.findById(id).get();
    }

    @Override
    public Accuser create(Accuser accuser) {
        accuserRepository.save(accuser);
        return accuser;
    }

    @Override
    public Accuser update(int id, Accuser accuser) {
        Accuser ac = accuserRepository.findById(id).get();
        ac.setCreatedAt(accuser.getCreatedAt());
        ac.setDateOfBirth(accuser.getDateOfBirth());
        ac.setLastname(accuser.getLastname());
        ac.setName(accuser.getName());
        ac.setReferenceNumberOfLawyer(accuser.getReferenceNumberOfLawyer());
        ac.setSpecialisation(accuser.getSpecialisation());
        accuserRepository.save(ac);
        return ac;
    }

    @Override
    public Accuser delete(int id) {
       Accuser ac = accuserRepository.findById(id).get();
       accuserRepository.delete(ac);
       return ac;
    }
    
}
