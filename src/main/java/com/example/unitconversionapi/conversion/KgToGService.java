package com.example.unitconversionapi.conversion;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KgToGService implements ConversionService{

    private float result;

    @Override
    public float convert(float f) {
        return 0;
    }



}
