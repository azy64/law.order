/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tunaweza.law.order.service;

import com.tunaweza.law.order.model.BurdenFile;
import com.tunaweza.law.order.repository.BurdenFileRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author azaria
 */
@Service
@AllArgsConstructor
public class BurdenFileService implements BurdenFileServiceInterface {

    private final BurdenFileRepository burdenRepository;
    @Override
    public List<BurdenFile> read() {
       return burdenRepository.findAll();
    }

    @Override
    public BurdenFile getOne(int id) {
        return burdenRepository.findById(id).get();
    }

    @Override
    public BurdenFile create(BurdenFile burden) {
        burdenRepository.save(burden);
        return burden;
    }

    @Override
    public BurdenFile update(int id, BurdenFile burden) {
        BurdenFile burdenSaved = burdenRepository.findById(id).get();
        burdenSaved.setAccuser(burden.getAccuser());
        burdenSaved.setCulprit(burden.getCulprit());
        burdenSaved.setDateOfCrime(burden.getDateOfCrime());
        burdenSaved.setDateOfTrial(burden.getDateOfTrial());
        burdenSaved.setDefender(burden.getDefender());
        burdenSaved.setJudge(burden.getJudge());
        burdenSaved.setReason(burden.getReason());
        burdenSaved.setReferenceOfFoldier(burden.getReferenceOfFoldier());
        burdenSaved.setStateOfFolder(burden.getStateOfFolder());
        burdenSaved.setStatusOfFolder(burden.getStatusOfFolder());
        burdenRepository.save(burdenSaved);
        return burdenSaved;
    }

    @Override
    public BurdenFile delete(int id) {
        BurdenFile burden = burdenRepository.findById(id).get();
        burdenRepository.delete(burden);
        return burden;
    }
    
}
