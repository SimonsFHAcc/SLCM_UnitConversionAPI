package com.example.unitconversionapi.conversion;

import com.example.unitconversionapi.dto.Request;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class ConversionService {

    private final Map<String, ConversionStrategy> conversionStrategyMap;

    /*
    * Die Liste, die als Argument im Konstruktor ist, sammelt automatisch alle Strategien, die das Interface
    * ConversionStrategy implementieren.
    * Diese werden dann mit ihrem jeweiligen ConversionCode als Key in die conversionStrategyMap geschrieben.
    * Function.identity() ist in diesem Fall ein fancy 'this', also die jeweilige Strategy.
    * */
    public ConversionService(List<ConversionStrategy> conversionStrategies) {
        conversionStrategyMap = conversionStrategies.stream()
                .collect(Collectors.toMap(ConversionStrategy::getConversionCode, Function.identity()));
    }

    public float convert(Request request){
        return conversionStrategyMap
                .get(request.getConversionCode())
                .convert(request.getFromValue());
    }
}
