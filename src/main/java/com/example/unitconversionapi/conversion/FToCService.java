package com.example.unitconversionapi.conversion;

import org.springframework.stereotype.Service;

@Service
public class FToCService implements ConversionService{

    @Override
    public float convert(float f) {
        return 5.f/9.f * (f - 32);
    }
}
