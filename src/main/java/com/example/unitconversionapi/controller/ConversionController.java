package com.example.unitconversionapi.controller;

import com.example.unitconversionapi.model.ConversionData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.validation.Valid;

@RestController
public class ConversionController {

    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine engine = scriptEngineManager.getEngineByName("JavaScript");
        System.out.println(engine.eval("x+4".replace("x", "9")));
    }

    @PostMapping("/convert")
    public Float convert(@RequestBody @Valid ConversionData conversionData) throws ScriptException {


        return null;
    }
}
