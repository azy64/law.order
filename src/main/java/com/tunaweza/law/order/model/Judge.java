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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


/**
 *
 * @author azaria
 */
@Entity
@Table(name="Judge")
@Getter
@Setter
@NoArgsConstructor
public class Judge{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Id;
    private String nom;
    private String prenom;
    private String referenceNumberOfJudge;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="specification_id")
    private Specialisation specialisation;
    private Date createdAt;
    
}
