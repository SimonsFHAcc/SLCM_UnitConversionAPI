package com.example.unitconversionapi.conversion;

import org.springframework.stereotype.Service;

@Service
public class FToCService implements ConversionService{

    public float covert(float f) {
//        C = 5/9 * (F – 32)
        return 5.f/9.f * (f - 32);
    }
}
