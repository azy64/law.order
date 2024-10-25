/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tunaweza.law.order.service;

import com.tunaweza.law.order.model.Judge;
import java.util.List;

/**
 *
 * @author azaria
 */
interface JudgeServiceInterface {
    public List<Judge> read();
    public Judge getOne(int id);
    public Judge create(Judge judge);
    public Judge update(int id, Judge judge);
    public Judge delete(int id);
}
