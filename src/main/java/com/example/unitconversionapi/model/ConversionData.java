package com.example.unitconversionapi.model;

public class ConversionData {

    private float fromValue;
    private String fromType;
    private String toType;

    public ConversionData(float fromValue, String fromType, String toType) {
        this.fromValue = fromValue;
        this.fromType = fromType;
        this.toType = toType;
    }

    public float getFromValue() {
        return fromValue;
    }

    public void setFromValue(float fromValue) {
        this.fromValue = fromValue;
    }

    public String getFromType() {
        return fromType;
    }

    public void setFromType(String fromType) {
        this.fromType = fromType;
    }

    public String getToType() {
        return toType;
    }

    public void setToType(String toType) {
        this.toType = toType;
    }
}
