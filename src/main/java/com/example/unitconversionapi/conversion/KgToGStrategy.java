package com.example.unitconversionapi.conversion;

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
