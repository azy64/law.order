/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import com.tunaweza.law.order.model.Specialisation;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author azaria
 */

public interface EntityService {
    
    public List<Specialisation> read();
    public Specialisation create(Specialisation entity);
    public Specialisation update(int id, Specialisation entity);
    public Specialisation delete(int id);
    
}
