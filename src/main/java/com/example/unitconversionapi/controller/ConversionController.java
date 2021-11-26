package com.example.unitconversionapi.controller;

import com.example.unitconversionapi.dto.Request;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.script.ScriptException;
import javax.validation.Valid;

@RestController
public class ConversionController {

    @PostMapping("/convert")
    public Float convert(@RequestBody @Valid Request request) {
        // TODO: 26.11.2021 Wir lesen aus dem Request-Objekt aus, welcher Typ in welchen konvertiert werden soll.
        //  Welcher Service / Controller übernimmt die Logik, dass der richtige conversion-Service aufgerufen wird?
        //  Und macht man das mit switch-case oder if-else? Ist das schön?

        return null;
    }
}
