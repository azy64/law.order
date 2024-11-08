/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tunaweza.law.order.service;

import com.tunaweza.law.order.model.CulpritDefender;
import com.tunaweza.law.order.repository.CulpritDefenderRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author azaria
 */
@Service
@AllArgsConstructor
public class CulpritDefenderService implements CulpritDefenderServiceInterface {

    private final CulpritDefenderRepository defenderrepository;
    @Override
    public List<CulpritDefender> read() {
        return defenderrepository.findAll();
    }

    @Override
    public CulpritDefender getOne(int id) {
        return defenderrepository.findById(id).get();
    }

    @Override
    public CulpritDefender create(CulpritDefender defender) {
       defenderrepository.save(defender);
       return defender;
    }

    @Override
    public CulpritDefender update(int id, CulpritDefender defender) {
        CulpritDefender defender1 = defenderrepository.findById(id).get();
        defender1.setCreatedAt(defender.getCreatedAt());
        defender1.setDateOfBirth(defender.getDateOfBirth());
        defender1.setLastname(defender.getLastname());
        defender1.setName(defender.getName());
        defender1.setReferenceNumberOfLawyer(defender.getReferenceNumberOfLawyer());
        defender1.setSpecialisation(defender.getSpecialisation());
        defenderrepository.save(defender1);
        return defender1;
    }

    @Override
    public CulpritDefender delete(int id) {
        CulpritDefender defender =defenderrepository.findById(id).get();
        defenderrepository.delete(defender);
        return defender;
    }
    
}
