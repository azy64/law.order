/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tunaweza.law.order.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author azaria
 */
@Entity
@Table(name="BurdenFile")
@Getter
@Setter
@AllArgsConstructor
public class BurdenFile {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String referenceOfFoldier;
    /*
    * take value gulty or acquitted
    */
    private String status ;
    /*
    * take value finished, pending or in process
    */
    private String stateOfFolder;
    /*
    * the reason why he is at the court!!!!
    */
    private String  reason;
    //date du procès
    private Date dateOfTrial;
    
    private Date dateOfCrime;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="accuser_id")
    private Accuser accuser;
    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="defender_id")
    private CulpritDefender defender;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="culprit_id")
    private Culprit culprit;
    @OneToOne(cascade = CascadeType.ALL)
    private Judge judge;
    
}
