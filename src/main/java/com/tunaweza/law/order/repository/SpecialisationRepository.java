/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tunaweza.law.order.repository;

import com.tunaweza.law.order.model.Specialisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


/**
 *
 * @author azaria
 */
@Component
@Repository
public interface SpecialisationRepository extends JpaRepository<Specialisation, Integer> {
    
}
