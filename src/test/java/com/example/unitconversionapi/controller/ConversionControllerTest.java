package com.example.unitconversionapi.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.test.web.servlet.MockMvc;




import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ConversionControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void shouldReturnOk() throws Exception {

        String content = "{\"fromValue\":1.0,\"fromType\":\"kg\",\"toType\":\"g\"}";

        this.mockMvc
                .perform(
                        post("/api/convert")
                                .content(content)
                                .header(HttpHeaders.CONTENT_TYPE, "allpication/json")
                )
                .andExpect(status().isOk());
    }

    void shouldReturnBadRequest() throws Exception {

        String content = "{\"fromValue\":1.0,\"fromType\":\"kg\",\"toType\":\"g\"}";

        this.mockMvc
                .perform(
                        post("/api/convert")
                                .content(content)
                                .header(HttpHeaders.CONTENT_TYPE, "allpication/json")
                )
                .andExpect(status().isBadRequest());
    }
}