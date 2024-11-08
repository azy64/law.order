/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tunaweza.law.order.service;

import com.tunaweza.law.order.model.CulpritDefender;
import java.util.List;

/**
 *
 * @author azaria
 */
public interface CulpritDefenderServiceInterface {
    public List<CulpritDefender> read();
    public CulpritDefender getOne(int id);
    public CulpritDefender create(CulpritDefender defender);
    public CulpritDefender update(int id, CulpritDefender defender);
    public CulpritDefender delete(int id);
}
