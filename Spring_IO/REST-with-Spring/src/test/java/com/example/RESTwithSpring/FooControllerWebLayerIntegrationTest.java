package com.example.RESTwithSpring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@RunWith(StringRunner.class)
//@SpringBootTest
//@AutoConfigureMockMvc
//public class FooControllerWebLayerIntegrationTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void whenTestApp_thenEmptyResponse() throws Exception{
//        this.mockMvc.perform(get("/foos")
//        .andExpect(status().isOk()));
//    }
//}
