package com.demo.weather.forecast.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class ForecastJsonResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 155850995944491322L;
    private Location location;
    private Current current;
    private Forecast forecast;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("location")
    public Location getLocation ( ) { 
        return this.location;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("location")
    public void setLocation (Location value) { 
        this.location = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("current")
    public Current getCurrent ( ) { 
        return this.current;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("current")
    public void setCurrent (Current value) { 
        this.current = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("forecast")
    public Forecast getForecast ( ) { 
        return this.forecast;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("forecast")
    public void setForecast (Forecast value) { 
        this.forecast = value;
    }
 
}
