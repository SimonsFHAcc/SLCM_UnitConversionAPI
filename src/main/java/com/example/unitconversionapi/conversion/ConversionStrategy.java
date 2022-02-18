package com.example.unitconversionapi.conversion;

public interface ConversionStrategy {

    float convert(float f);

    String getConversionCode();
}
