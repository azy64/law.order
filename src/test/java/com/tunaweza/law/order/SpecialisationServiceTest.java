package com.tunaweza.law.order;


import com.tunaweza.law.order.model.Specialisation;
import com.tunaweza.law.order.service.SpecialisationServiceInterface;
import java.util.Date;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author azaria
 */
@SpringBootTest
@ComponentScan(basePackages = "com.tunaweza.law.*")
@AutoConfigureMockMvc
public class SpecialisationServiceTest {
    
    @Autowired
    private SpecialisationServiceInterface specialisationService;
    @Test
    void createSpecialisation()throws Exception{
        Specialisation sp = new Specialisation();
        Specialisation resultSpec;
        sp.setCreatedAt(new Date());
        sp.setLibelle("Droit d'heritage");
        resultSpec= specialisationService.create(sp);
        assertThat(resultSpec.getId()).isNotZero().isNotNull();
        
    }
    
    @Test
    void updateSpecialisation()throws Exception{
        
        Specialisation sp = new Specialisation();
        Specialisation resultSpec;
        sp.setCreatedAt(new Date());
        sp.setLibelle("Droit d'heritage");
        resultSpec= specialisationService.create(sp);
        resultSpec.setLibelle("droit penal");
        Specialisation result1;
        int tmp = Integer.parseInt(resultSpec.getId()+"");
        result1 = specialisationService.
                update(tmp, resultSpec);
        assertThat(resultSpec.getId()).isNotZero().isNotNull();
        assertThat(resultSpec.getCreatedAt()).isEqualTo(sp.getCreatedAt());
        assertThat(result1.getLibelle()).asString().isEqualTo(resultSpec.getLibelle());
        assertEquals(result1.getId(),resultSpec.getId());
    }
    
    @Test
    void deleteSpecialisation()throws Exception{
        Specialisation sp = new Specialisation();
        Specialisation resultSpec;
        sp.setCreatedAt(new Date());
        sp.setLibelle("Droit d'heritage");
        resultSpec= specialisationService.create(sp);
        resultSpec.setLibelle("droit penal");
        Specialisation result1;
        int tmp = Integer.parseInt(resultSpec.getId()+"");
        result1 = specialisationService.
                delete(tmp);
        assertThat(resultSpec.getId()).isNotZero().isNotNull();
        assertThat(resultSpec.getCreatedAt()).isEqualTo(sp.getCreatedAt());
        assertThat(result1).isNotNull();
        assertEquals(result1.getId(),resultSpec.getId());
    }
    
    @Test
    void getSpecialisations()throws Exception{
        List <Specialisation> specialisations = specialisationService.read();
        assertThat(specialisations).isNotNull();
        assertThat(specialisations.size()).isNotNull().isNotEqualTo(0);
        assertThat(specialisations.get(0)).isNotNull().isInstanceOf(Specialisation.class);
    }
}
