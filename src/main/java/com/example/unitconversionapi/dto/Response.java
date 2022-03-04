package com.example.unitconversionapi.dto;

public class Response {


    private String responseMessage;

    private float result;

    public Response() {

    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public Response(float result) {
        this.result = result;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }
}
