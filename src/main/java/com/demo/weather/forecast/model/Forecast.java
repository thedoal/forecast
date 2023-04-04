package com.demo.weather.forecast.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class Forecast 
        implements java.io.Serializable {
    private static final long serialVersionUID = -88144496279653692L;
    private List<Forecastday> forecastday;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("forecastday")
    public List<Forecastday> getForecastday ( ) { 
        return this.forecastday;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("forecastday")
    public void setForecastday (List<Forecastday> value) { 
        this.forecastday = value;
    }
 
}
