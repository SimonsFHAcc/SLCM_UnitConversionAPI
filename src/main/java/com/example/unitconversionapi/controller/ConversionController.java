package com.example.unitconversionapi.controller;

import com.example.unitconversionapi.model.ConversionData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ConversionController {

    @PostMapping("/convert")
    public Float convert(@RequestBody @Valid ConversionData conversionData){
        return null;
    }
}
