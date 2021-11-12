package com.example.unitconversionapi.model;

public class Celsius {

    private float fromValue;

    public float convertCelsiusToFahrenheit () {
        float celsius;
        celsius = 5/9 * (fromValue - 32);
        return celsius;
    }

}
