package com.example.unitconversionapi.conversion;

import org.springframework.stereotype.Service;

@Service
public class CToFStrategy implements ConversionStrategy{

    @Override
    public float convert(float f) {
        return f * 9 / 5 + 32;
    }

    @Override
    public String getConversionCode() {
        return "cf";
    }
}
