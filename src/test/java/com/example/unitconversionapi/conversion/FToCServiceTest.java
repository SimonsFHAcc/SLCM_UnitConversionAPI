package com.example.unitconversionapi.conversion;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FToCServiceTest {

    @Autowired
    FToCService fToCService;

    @Test
    void testConvert(){
        assertEquals(0.f, fToCService.covert(32.f));
    }
}