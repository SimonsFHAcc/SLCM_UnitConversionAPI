package com.example.unitconversionapi.conversion;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FToCStrategyTest {

    @Autowired
    FToCStrategy fToCStrategy;

    @Test
    void testConvert(){
        assertEquals(0.f, fToCStrategy.convert(32.f));
    }
}