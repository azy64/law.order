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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import service.EntityModel;

/**
 *
 * @author azaria
 */
@Entity
@Table(name="CulpritDefender")
@Getter
@Setter
@AllArgsConstructor
public class CulpritDefender implements EntityModel{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Id;
    private String name;
    private String lastname;
    private String referenceNumberOfLawyer;
    @DateTimeFormat
    private Date dateOfBirth;
    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="specialisation_id")
    private Specialisation specialisation;
    private Date createdAt;
}
