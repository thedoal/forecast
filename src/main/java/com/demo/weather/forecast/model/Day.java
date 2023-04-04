
package com.demo.weather.forecast.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class Day 
        implements java.io.Serializable {
    private static final long serialVersionUID = 6234553622804019665L;
    private Double maxtempC;
    private Double maxtempF;
    private Double mintempC;
    private Double mintempF;
    private Double avgtempC;
    private Double avgtempF;
    private Double maxwindMph;
    private Double maxwindKph;
    private Double totalprecipMm;
    private Double totalprecipIn;
    private Double avgvisKm;
    private Double avgvisMiles;
    private Double avghumidity;
    private Condition condition;
    private Double uv;
    /** GETTER
     * Maximum temperature in celsius for the day.
     */
    @JsonGetter("maxtemp_c")
    public Double getMaxtempC ( ) { 
        return this.maxtempC;
    }
    
    /** SETTER
     * Maximum temperature in celsius for the day.
     */
    @JsonSetter("maxtemp_c")
    public void setMaxtempC (Double value) { 
        this.maxtempC = value;
    }
 
    /** GETTER
     * Maximum temperature in fahrenheit for the day
     */
    @JsonGetter("maxtemp_f")
    public Double getMaxtempF ( ) { 
        return this.maxtempF;
    }
    
    /** SETTER
     * Maximum temperature in fahrenheit for the day
     */
    @JsonSetter("maxtemp_f")
    public void setMaxtempF (Double value) { 
        this.maxtempF = value;
    }
 
    /** GETTER
     * Minimum temperature in celsius for the day
     */
    @JsonGetter("mintemp_c")
    public Double getMintempC ( ) { 
        return this.mintempC;
    }
    
    /** SETTER
     * Minimum temperature in celsius for the day
     */
    @JsonSetter("mintemp_c")
    public void setMintempC (Double value) { 
        this.mintempC = value;
    }
 
    /** GETTER
     * Minimum temperature in fahrenheit for the day
     */
    @JsonGetter("mintemp_f")
    public Double getMintempF ( ) { 
        return this.mintempF;
    }
    
    /** SETTER
     * Minimum temperature in fahrenheit for the day
     */
    @JsonSetter("mintemp_f")
    public void setMintempF (Double value) { 
        this.mintempF = value;
    }
 
    /** GETTER
     * Average temperature in celsius for the day
     */
    @JsonGetter("avgtemp_c")
    public Double getAvgtempC ( ) { 
        return this.avgtempC;
    }
    
    /** SETTER
     * Average temperature in celsius for the day
     */
    @JsonSetter("avgtemp_c")
    public void setAvgtempC (Double value) { 
        this.avgtempC = value;
    }
 
    /** GETTER
     * Average temperature in fahrenheit for the day
     */
    @JsonGetter("avgtemp_f")
    public Double getAvgtempF ( ) { 
        return this.avgtempF;
    }
    
    /** SETTER
     * Average temperature in fahrenheit for the day
     */
    @JsonSetter("avgtemp_f")
    public void setAvgtempF (Double value) { 
        this.avgtempF = value;
    }
 
    /** GETTER
     * Maximum wind speed in miles per hour
     */
    @JsonGetter("maxwind_mph")
    public Double getMaxwindMph ( ) { 
        return this.maxwindMph;
    }
    
    /** SETTER
     * Maximum wind speed in miles per hour
     */
    @JsonSetter("maxwind_mph")
    public void setMaxwindMph (Double value) { 
        this.maxwindMph = value;
    }
 
    /** GETTER
     * Maximum wind speed in kilometer per hour
     */
    @JsonGetter("maxwind_kph")
    public Double getMaxwindKph ( ) { 
        return this.maxwindKph;
    }
    
    /** SETTER
     * Maximum wind speed in kilometer per hour
     */
    @JsonSetter("maxwind_kph")
    public void setMaxwindKph (Double value) { 
        this.maxwindKph = value;
    }
 
    /** GETTER
     * Total precipitation in milimeter
     */
    @JsonGetter("totalprecip_mm")
    public Double getTotalprecipMm ( ) { 
        return this.totalprecipMm;
    }
    
    /** SETTER
     * Total precipitation in milimeter
     */
    @JsonSetter("totalprecip_mm")
    public void setTotalprecipMm (Double value) { 
        this.totalprecipMm = value;
    }
 
    /** GETTER
     * Total precipitation in inches
     */
    @JsonGetter("totalprecip_in")
    public Double getTotalprecipIn ( ) { 
        return this.totalprecipIn;
    }
    
    /** SETTER
     * Total precipitation in inches
     */
    @JsonSetter("totalprecip_in")
    public void setTotalprecipIn (Double value) { 
        this.totalprecipIn = value;
    }
 
    /** GETTER
     * Average visibility in kilometer
     */
    @JsonGetter("avgvis_km")
    public Double getAvgvisKm ( ) { 
        return this.avgvisKm;
    }
    
    /** SETTER
     * Average visibility in kilometer
     */
    @JsonSetter("avgvis_km")
    public void setAvgvisKm (Double value) { 
        this.avgvisKm = value;
    }
 
    /** GETTER
     * Average visibility in miles
     */
    @JsonGetter("avgvis_miles")
    public Double getAvgvisMiles ( ) { 
        return this.avgvisMiles;
    }
    
    /** SETTER
     * Average visibility in miles
     */
    @JsonSetter("avgvis_miles")
    public void setAvgvisMiles (Double value) { 
        this.avgvisMiles = value;
    }
 
    /** GETTER
     * Average humidity as percentage
     */
    @JsonGetter("avghumidity")
    public Double getAvghumidity ( ) { 
        return this.avghumidity;
    }
    
    /** SETTER
     * Average humidity as percentage
     */
    @JsonSetter("avghumidity")
    public void setAvghumidity (Double value) { 
        this.avghumidity = value;
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
 
}
