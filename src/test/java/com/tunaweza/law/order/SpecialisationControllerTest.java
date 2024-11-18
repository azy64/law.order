/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tunaweza.law.order;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tunaweza.law.order.model.Specialisation;
import java.util.Date;
import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 *
 * @author azaria
 */

//@Import({JudgeControler.class, SpecialisationController.class})
//@WebMvcTest(controllers= SpecialisationController.class)
@SpringBootTest
@AutoConfigureMockMvc
class SpecialisationControllerTest {
    
    @Autowired
    private MockMvc mockMvc;
    
    @Test
    void shouldReturnString() throws Exception {
        //System.out.println("resultat:"+ mockMvc.perform(get("/law/specialisaion")));
        mockMvc.perform(get("/specialisation/")).andDo(print())
                .andExpect(content().string("Je suis la page Acceuil"))
                .andExpect(status().isOk());
    }
    
    @Test
    void createSpecialisation() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        Specialisation sp = new Specialisation();
        sp.setCreatedAt(new Date());
        sp.setLibelle("Droit des affaires et famille");
        mockMvc.perform(post("/specialisation/save/").contentType(MediaType.APPLICATION_JSON)
        .content(objectMapper.writeValueAsString(sp))). andDo(print()).
                andExpect(status().isOk()).andExpect(jsonPath("$.libelle",is(sp.getLibelle())));
    }
       
    //@Test
  //  void deleteSpecialisation()throws Exception{
         //mockMvc.perform(delete("/specialisation/delete/{id}",49)).andDo(print()).
           //      andExpect(status().isOk());
    //}
    
}
