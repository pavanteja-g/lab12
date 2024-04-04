package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(NumController.class)

public class NumControllerTest {

    @Autowired
    private MockMvc MockMvc;
    @Autowired
    private org.springframework.test.web.servlet.MockMvc mockMvc;

    @Test
    public void testDoubleNumber() throws Exception{

        mockMvc.perform(get("/greeting?num=7"))
                .andExpect(status().isOk())
                .andExpect(content().string("14"));
    }




}
