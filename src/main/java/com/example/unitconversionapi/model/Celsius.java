package com.example.unitconversionapi.model;

public class Celsius {

    private float fromCelsiusValue;

    public Celsius(float fromValue) {
        this.fromCelsiusValue = fromValue;
    }

    public float getFromCelsiusValue() {
        return fromCelsiusValue;
    }

    public void setFromCelsiusValue(float fromCelsiusValue) {
        this.fromCelsiusValue = fromCelsiusValue;
    }

    /*    public float convertCelsiusToFahrenheit () {
        float celsius;
        celsius = 5/9 * (fromValue - 32);
        return celsius;
    }*/

}
