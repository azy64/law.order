/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tunaweza.law.order.service;

import com.tunaweza.law.order.model.Culprit;
import java.util.List;

/**
 *
 * @author azaria
 */
public interface CulpritServiceInterface {
    public List<Culprit> read();
    public Culprit getOne(int id);
    public Culprit create(Culprit culprit);
    public Culprit update(int id, Culprit culprit);
    public Culprit delete(int id);
}
