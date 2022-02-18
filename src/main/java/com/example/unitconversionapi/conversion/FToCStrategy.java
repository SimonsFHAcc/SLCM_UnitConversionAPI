package com.example.unitconversionapi.conversion;

import org.springframework.stereotype.Service;

@Service
public class FToCStrategy implements ConversionStrategy{

    @Override
    public float convert(float f) {
        return 5.f / 9.f * (f - 32);
    }

    @Override
    public String getConversionCode() {
        return "fc";
    }
}
