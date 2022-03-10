package com.example.unitconversionapi.controller;

import com.example.unitconversionapi.conversion.ConversionService;
import com.example.unitconversionapi.dto.Request;
import com.example.unitconversionapi.dto.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
public class ConversionController {

    private ConversionService conversionService;

    public ConversionController(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @PostMapping("/convert")
    public Response convert(@RequestBody @Valid Request request) {
        return new Response(request, conversionService.convert(request));
    }
}
