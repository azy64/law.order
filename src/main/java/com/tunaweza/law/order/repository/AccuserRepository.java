/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tunaweza.law.order.repository;

import com.tunaweza.law.order.model.Accuser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author azaria
 */
public interface AccuserRepository extends JpaRepository<Accuser,Integer> {
    
}
