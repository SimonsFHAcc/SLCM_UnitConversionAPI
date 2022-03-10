package com.example.unitconversionapi.dto;

public class Response {

    private boolean valid;
    private float result;
    private float fromValue;
    private String fromType;
    private String toType;

    public Response(float result) {
        this.result = result;
    }

    public Response(Request request, float result){
        this.valid = true;
        this.result = result;
        this.fromValue = request.getFromValue();
        this.fromType = request.getFromType();
        this.toType = request.getToType();
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }
}
