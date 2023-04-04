package com.demo.weather.forecast.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class Astro 
        implements java.io.Serializable {
    private static final long serialVersionUID = 8217103204793016969L;
    private String sunrise;
    private String sunset;
    private String moonrise;
    private String moonset;
    /** GETTER
     * Sunrise time
     */
    @JsonGetter("sunrise")
    public String getSunrise ( ) { 
        return this.sunrise;
    }
    
    /** SETTER
     * Sunrise time
     */
    @JsonSetter("sunrise")
    public void setSunrise (String value) { 
        this.sunrise = value;
    }
 
    /** GETTER
     * Sunset time
     */
    @JsonGetter("sunset")
    public String getSunset ( ) { 
        return this.sunset;
    }
    
    /** SETTER
     * Sunset time
     */
    @JsonSetter("sunset")
    public void setSunset (String value) { 
        this.sunset = value;
    }
 
    /** GETTER
     * Moonrise time
     */
    @JsonGetter("moonrise")
    public String getMoonrise ( ) { 
        return this.moonrise;
    }
    
    /** SETTER
     * Moonrise time
     */
    @JsonSetter("moonrise")
    public void setMoonrise (String value) { 
        this.moonrise = value;
    }
 
    /** GETTER
     * Moonset time
     */
    @JsonGetter("moonset")
    public String getMoonset ( ) { 
        return this.moonset;
    }
    
    /** SETTER
     * Moonset time
     */
    @JsonSetter("moonset")
    public void setMoonset (String value) { 
        this.moonset = value;
    }
 
}
