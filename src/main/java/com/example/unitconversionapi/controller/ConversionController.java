package com.example.unitconversionapi.controller;

import com.example.unitconversionapi.conversion.ConversionService;
import com.example.unitconversionapi.dto.Request;
import com.example.unitconversionapi.dto.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.script.ScriptException;
import javax.validation.Valid;

@RestController
public class ConversionController {

    private ConversionService conversionService;

    public ConversionController(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @PostMapping("/convert")
    public Response convert(@RequestBody @Valid Request request) {
        return new Response(conversionService.convert(request));
    }
}
