package com.example.unitconversionapi.conversion;

import org.springframework.stereotype.Service;

@Service
public class GToKgStrategy implements ConversionStrategy{

    @Override
    public float convert(float f) {
        return f/1000;
    }

    @Override
    public String getConversionCode() {
        return "gkg";
    }
}
