/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tunaweza.law.order.service;

import com.tunaweza.law.order.model.Accuser;
import java.util.List;

/**
 *
 * @author azaria
 */
public interface AccuserServiceInterface {
    public List<Accuser> read();
    public Accuser getOne(int id);
    public Accuser create(Accuser accuser);
    public Accuser update(int id, Accuser accuser);
    public Accuser delete(int id);
}
