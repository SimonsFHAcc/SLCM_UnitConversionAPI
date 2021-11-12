package com.example.unitconversionapi.model;

public class Fahrenheit {
    private float fromValue;

    public Fahrenheit(float fromValue) {
        this.fromValue = fromValue;
    }


    public float convert(){
        float celsius;
        celsius = 5/9 * (fromValue-32);
        return celsius;
    }

}
