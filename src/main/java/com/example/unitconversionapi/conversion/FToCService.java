package com.example.unitconversionapi.conversion;

import org.springframework.stereotype.Service;

@Service
public class FToCService implements ConversionService{

    float result;

    @Override
    public float convert(float f) {
//        C = 5/9 * (F – 32)
       result = 5.f/9.f * (f - 32);
       return result;
    }
}
