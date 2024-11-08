/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tunaweza.law.order.controller;

import java.util.List;


/**
 *
 * @author azaria
 * @param <T>
 */
public abstract class TunawezaRestController <T> {
   
    public abstract String index();
    public abstract T getOne(int id);
    
    public abstract T add(T entity);
    public abstract List <T> read(); 
    public abstract T update(T entity,int id);
    public abstract T delete (int id);
}
