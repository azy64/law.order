/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tunaweza.law.order.service;

import com.tunaweza.law.order.model.BurdenFile;
import java.util.List;

/**
 *
 * @author azaria
 */
public interface BurdenFileServiceInterface {
    public List<BurdenFile> read();
    public BurdenFile getOne(int id);
    public BurdenFile create(BurdenFile burden);
    public BurdenFile update(int id, BurdenFile burden);
    public BurdenFile delete(int id);
}
