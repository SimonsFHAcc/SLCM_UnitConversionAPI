package com.example.unitconversionapi.controller;

import com.example.unitconversionapi.conversion.KgToGService;
import com.example.unitconversionapi.dto.Request;
import com.example.unitconversionapi.dto.Response;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.script.ScriptException;
import javax.servlet.RequestDispatcher;
import javax.validation.Valid;

@RestController
public class ConversionController {

    @PostMapping("/convert")
    public Response convert(@RequestBody @Valid Request request) {
        // TODO: 26.11.2021 Wir lesen aus dem Request-Objekt aus, welcher Typ in welchen konvertiert werden soll.
        //  Welcher Service / Controller übernimmt die Logik, dass der richtige conversion-Service aufgerufen wird?
        //  Und macht man das mit switch-case oder if-else? Ist das schön?



        String conversionMethod = request.getFromType() + request.getToType();

        Response response = new Response();

        switch (conversionMethod){
            case "gkg":
                break;
            case "kgg":
                KgToGService kgToGService = new KgToGService();
                response.setResult(kgToGService.convert(request.getFromValue()));
                break;
            case "fc":
                break;
            case "cf":
                break;
        }


        return response;
    }
}
