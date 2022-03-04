package com.example.unitconversionapi.conversion;

import org.springframework.stereotype.Service;

@Service
public class KgToGStrategy implements ConversionStrategy{

    @Override
    public float convert(float f) {
        return f * 1000.f;
    }

    @Override
    public String getConversionCode() {
        return "kgg";
    }
}
