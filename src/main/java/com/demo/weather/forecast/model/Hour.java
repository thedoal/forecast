package com.demo.weather.forecast.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class Hour 
        implements java.io.Serializable {
    private static final long serialVersionUID = -4742803188539272633L;
    private Integer timeEpoch;
    private String time;
    private Double tempC;
    private Double tempF;
    private Integer isDay;
    private Condition condition;
    private Double windMph;
    private Double windKph;
    private Integer windDegree;
    private String windDir;
    private Double pressureMb;
    private Double pressureIn;
    private Double precipMm;
    private Double precipIn;
    private Integer humidity;
    private Integer cloud;
    private Double feelslikeC;
    private Double feelslikeF;
    private Double visKm;
    private Double visMiles;
    private Double uv;
    private Double gustMph;
    private Double gustKph;
    /** GETTER
     * Time as epoch
     */
    @JsonGetter("time_epoch")
    public Integer getTimeEpoch ( ) { 
        return this.timeEpoch;
    }
    
    /** SETTER
     * Time as epoch
     */
    @JsonSetter("time_epoch")
    public void setTimeEpoch (Integer value) { 
        this.timeEpoch = value;
    }
 
    /** GETTER
     * Date and time
     */
    @JsonGetter("time")
    public String getTime ( ) { 
        return this.time;
    }
    
    /** SETTER
     * Date and time
     */
    @JsonSetter("time")
    public void setTime (String value) { 
        this.time = value;
    }
 
    /** GETTER
     * Temperature in celsius
     */
    @JsonGetter("temp_c")
    public Double getTempC ( ) { 
        return this.tempC;
    }
    
    /** SETTER
     * Temperature in celsius
     */
    @JsonSetter("temp_c")
    public void setTempC (Double value) { 
        this.tempC = value;
    }
 
    /** GETTER
     * Temperature in fahrenheit
     */
    @JsonGetter("temp_f")
    public Double getTempF ( ) { 
        return this.tempF;
    }
    
    /** SETTER
     * Temperature in fahrenheit
     */
    @JsonSetter("temp_f")
    public void setTempF (Double value) { 
        this.tempF = value;
    }
 
    /** GETTER
     * 1 = Yes 0 = No <br />Whether to show day condition icon or night icon
     */
    @JsonGetter("is_day")
    public Integer getIsDay ( ) { 
        return this.isDay;
    }
    
    /** SETTER
     * 1 = Yes 0 = No <br />Whether to show day condition icon or night icon
     */
    @JsonSetter("is_day")
    public void setIsDay (Integer value) { 
        this.isDay = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("condition")
    public Condition getCondition ( ) { 
        return this.condition;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("condition")
    public void setCondition (Condition value) { 
        this.condition = value;
    }
 
    /** GETTER
     * Wind speed in miles per hour
     */
    @JsonGetter("wind_mph")
    public Double getWindMph ( ) { 
        return this.windMph;
    }
    
    /** SETTER
     * Wind speed in miles per hour
     */
    @JsonSetter("wind_mph")
    public void setWindMph (Double value) { 
        this.windMph = value;
    }
 
    /** GETTER
     * Wind speed in kilometer per hour
     */
    @JsonGetter("wind_kph")
    public Double getWindKph ( ) { 
        return this.windKph;
    }
    
    /** SETTER
     * Wind speed in kilometer per hour
     */
    @JsonSetter("wind_kph")
    public void setWindKph (Double value) { 
        this.windKph = value;
    }
 
    /** GETTER
     * Wind direction in degrees
     */
    @JsonGetter("wind_degree")
    public Integer getWindDegree ( ) { 
        return this.windDegree;
    }
    
    /** SETTER
     * Wind direction in degrees
     */
    @JsonSetter("wind_degree")
    public void setWindDegree (Integer value) { 
        this.windDegree = value;
    }
 
    /** GETTER
     * Wind direction as 16 point compass. e.g.: NSW
     */
    @JsonGetter("wind_dir")
    public String getWindDir ( ) { 
        return this.windDir;
    }
    
    /** SETTER
     * Wind direction as 16 point compass. e.g.: NSW
     */
    @JsonSetter("wind_dir")
    public void setWindDir (String value) { 
        this.windDir = value;
    }
 
    /** GETTER
     * Pressure in millibars
     */
    @JsonGetter("pressure_mb")
    public Double getPressureMb ( ) { 
        return this.pressureMb;
    }
    
    /** SETTER
     * Pressure in millibars
     */
    @JsonSetter("pressure_mb")
    public void setPressureMb (Double value) { 
        this.pressureMb = value;
    }
 
    /** GETTER
     * Pressure in inches
     */
    @JsonGetter("pressure_in")
    public Double getPressureIn ( ) { 
        return this.pressureIn;
    }
    
    /** SETTER
     * Pressure in inches
     */
    @JsonSetter("pressure_in")
    public void setPressureIn (Double value) { 
        this.pressureIn = value;
    }
 
    /** GETTER
     * Precipitation amount in millimeters
     */
    @JsonGetter("precip_mm")
    public Double getPrecipMm ( ) { 
        return this.precipMm;
    }
    
    /** SETTER
     * Precipitation amount in millimeters
     */
    @JsonSetter("precip_mm")
    public void setPrecipMm (Double value) { 
        this.precipMm = value;
    }
 
    /** GETTER
     * Precipitation amount in inches
     */
    @JsonGetter("precip_in")
    public Double getPrecipIn ( ) { 
        return this.precipIn;
    }
    
    /** SETTER
     * Precipitation amount in inches
     */
    @JsonSetter("precip_in")
    public void setPrecipIn (Double value) { 
        this.precipIn = value;
    }
 
    /** GETTER
     * Humidity as percentage
     */
    @JsonGetter("humidity")
    public Integer getHumidity ( ) { 
        return this.humidity;
    }
    
    /** SETTER
     * Humidity as percentage
     */
    @JsonSetter("humidity")
    public void setHumidity (Integer value) { 
        this.humidity = value;
    }
 
    /** GETTER
     * Cloud cover as percentage
     */
    @JsonGetter("cloud")
    public Integer getCloud ( ) { 
        return this.cloud;
    }
    
    /** SETTER
     * Cloud cover as percentage
     */
    @JsonSetter("cloud")
    public void setCloud (Integer value) { 
        this.cloud = value;
    }
 
    /** GETTER
     * Feels like temperature as celcius
     */
    @JsonGetter("feelslike_c")
    public Double getFeelslikeC ( ) { 
        return this.feelslikeC;
    }
    
    /** SETTER
     * Feels like temperature as celcius
     */
    @JsonSetter("feelslike_c")
    public void setFeelslikeC (Double value) { 
        this.feelslikeC = value;
    }
 
    /** GETTER
     * Feels like temperature as fahrenheit
     */
    @JsonGetter("feelslike_f")
    public Double getFeelslikeF ( ) { 
        return this.feelslikeF;
    }
    
    /** SETTER
     * Feels like temperature as fahrenheit
     */
    @JsonSetter("feelslike_f")
    public void setFeelslikeF (Double value) { 
        this.feelslikeF = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("vis_km")
    public Double getVisKm ( ) { 
        return this.visKm;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("vis_km")
    public void setVisKm (Double value) { 
        this.visKm = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("vis_miles")
    public Double getVisMiles ( ) { 
        return this.visMiles;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("vis_miles")
    public void setVisMiles (Double value) { 
        this.visMiles = value;
    }
 
    /** GETTER
     * UV Index
     */
    @JsonGetter("uv")
    public Double getUv ( ) { 
        return this.uv;
    }
    
    /** SETTER
     * UV Index
     */
    @JsonSetter("uv")
    public void setUv (Double value) { 
        this.uv = value;
    }
 
    /** GETTER
     * Wind gust in miles per hour
     */
    @JsonGetter("gust_mph")
    public Double getGustMph ( ) { 
        return this.gustMph;
    }
    
    /** SETTER
     * Wind gust in miles per hour
     */
    @JsonSetter("gust_mph")
    public void setGustMph (Double value) { 
        this.gustMph = value;
    }
 
    /** GETTER
     * Wind gust in kilometer per hour
     */
    @JsonGetter("gust_kph")
    public Double getGustKph ( ) { 
        return this.gustKph;
    }
    
    /** SETTER
     * Wind gust in kilometer per hour
     */
    @JsonSetter("gust_kph")
    public void setGustKph (Double value) { 
        this.gustKph = value;
    }
 
}
