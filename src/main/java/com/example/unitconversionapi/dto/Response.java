package com.example.unitconversionapi.dto;

public class Response {

    private boolean valid;
    private float result;
    private float fromValue;
    private String fromType;
    private String toType;


    public Response(boolean valid, float result, float fromValue, String fromType, String toType) {
        this.valid = valid;
        this.result = result;
        this.fromValue = fromValue;
        this.fromType = fromType;
        this.toType = toType;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }
}
