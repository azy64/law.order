/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tunaweza.law.order.service;

import com.tunaweza.law.order.model.Judge;
import com.tunaweza.law.order.repository.JudgeRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author azaria
 */
@Service
@Data
@AllArgsConstructor
public class JudgeService implements JudgeServiceInterface {
    @Autowired
    private final JudgeRepository judgeRepository;

    @Override
    public List<Judge> read() {
       return judgeRepository.findAll();
    }

    @Override
    public Judge getOne(int id) {
       return judgeRepository.findById(id).get();
    }

    @Override
    public Judge create(Judge judge) {
      judgeRepository.save(judge);
      return judge;
    }

    @Override
    public Judge update(int id, Judge judge) {
        Judge juge = judgeRepository.findById(id).get();
        juge.setCreatedAt(judge.getCreatedAt());
        juge.setNom(judge.getNom());
        juge.setPrenom(judge.getPrenom());
        juge.setReferenceNumberOfJudge(judge.getReferenceNumberOfJudge());
        juge.setSpecialisation(judge.getSpecialisation());
        judgeRepository.save(juge);
        return juge;
    }

    @Override
    public Judge delete(int id) {
       Judge judge =judgeRepository.findById(id).get();
       judgeRepository.delete(judge);
       return judge;
    }

   
    
}
