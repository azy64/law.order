package com.tunaweza.law.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
//@Import(SpecialisationController.class)
class LawOrderApplicationTests {

    @Autowired
    private MockMvc mockMvc;
    
	@Test
	void contextLoads()throws Exception {
            mockMvc.perform(get("/judge/")).andExpect(status().isOk());
	}

}
