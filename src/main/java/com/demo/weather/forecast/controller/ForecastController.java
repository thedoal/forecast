package com.demo.weather.forecast.controller;
import java.util.List;
import java.util.concurrent.Future;

import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.weather.forecast.WeatherAPIClient;
import com.demo.weather.forecast.http.client.APICallBack;
import com.demo.weather.forecast.http.client.HttpContext;
import com.demo.weather.forecast.model.ForecastJsonResponse;
import com.demo.weather.forecast.model.Forecastday;
import com.demo.weather.forecast.model.RequestRest;
import com.demo.weather.forecast.model.ResponseRest;

@Controller
public class ForecastController{
    String key = "c86dd8ba1c0343b5bb510250230304";
    ResponseRest responseRest = new ResponseRest();
    WeatherAPIClient client = new WeatherAPIClient(key);
    APIsController aPIs = client.getAPIs(); 
    ForecastJsonResponse forecastJsonResponse;

    @RequestMapping("/forecast")
    public @ResponseBody ResponseRest  getForecastWeatherAsync(@Validated @RequestBody RequestRest requestRest) throws Throwable{
        
        
        // Invoking the API call with sample inputs
        int days = 1;
        LocalDate date = new LocalDate();

        forecastJsonResponse = aPIs.getForecastWeather(requestRest.getCity(), days, date.plusDays(1), null, null, null);
        responseRest.setDate(forecastJsonResponse.getForecast().getForecastday().get(0).getDate());
        responseRest.setForecast(forecastJsonResponse.getForecast().getForecastday().get(0).getDay().getCondition().getText());
        return responseRest;

    }

       
}

