package com.demo.weather.forecast.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class Forecastday 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5397660598274391661L;
    private String date;
    private Integer dateEpoch;
    private Day day;
    private Astro astro;
    /** GETTER
     * Forecast date
     */
    @JsonGetter("date")
    public String getDate ( ) { 
        return this.date;
    }
    
    /** SETTER
     * Forecast date
     */
    @JsonSetter("date")
    public void setDate (String value) { 
        this.date = value;
    }
 
    /** GETTER
     * Forecast date as unix time.
     */
    @JsonGetter("date_epoch")
    public Integer getDateEpoch ( ) { 
        return this.dateEpoch;
    }
    
    /** SETTER
     * Forecast date as unix time.
     */
    @JsonSetter("date_epoch")
    public void setDateEpoch (Integer value) { 
        this.dateEpoch = value;
    }
 
    /** GETTER
     * See day element
     */
    @JsonGetter("day")
    public Day getDay ( ) { 
        return this.day;
    }
    
    /** SETTER
     * See day element
     */
    @JsonSetter("day")
    public void setDay (Day value) { 
        this.day = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("astro")
    public Astro getAstro ( ) { 
        return this.astro;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("astro")
    public void setAstro (Astro value) { 
        this.astro = value;
    }
 
}
