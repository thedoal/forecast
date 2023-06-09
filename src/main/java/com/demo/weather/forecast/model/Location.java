package com.demo.weather.forecast.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class Location 
        implements java.io.Serializable {
    private static final long serialVersionUID = -988571205296280554L;
    private String name;
    private String region;
    private String country;
    private Double lat;
    private Double lon;
    private String tzId;
    private Integer localtimeEpoch;
    private String localtime;
    /** GETTER
     * Local area name.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Local area name.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * Local area region.
     */
    @JsonGetter("region")
    public String getRegion ( ) { 
        return this.region;
    }
    
    /** SETTER
     * Local area region.
     */
    @JsonSetter("region")
    public void setRegion (String value) { 
        this.region = value;
    }
 
    /** GETTER
     * Country
     */
    @JsonGetter("country")
    public String getCountry ( ) { 
        return this.country;
    }
    
    /** SETTER
     * Country
     */
    @JsonSetter("country")
    public void setCountry (String value) { 
        this.country = value;
    }
 
    /** GETTER
     * Area latitude
     */
    @JsonGetter("lat")
    public Double getLat ( ) { 
        return this.lat;
    }
    
    /** SETTER
     * Area latitude
     */
    @JsonSetter("lat")
    public void setLat (Double value) { 
        this.lat = value;
    }
 
    /** GETTER
     * Area longitude
     */
    @JsonGetter("lon")
    public Double getLon ( ) { 
        return this.lon;
    }
    
    /** SETTER
     * Area longitude
     */
    @JsonSetter("lon")
    public void setLon (Double value) { 
        this.lon = value;
    }
 
    /** GETTER
     * Time zone
     */
    @JsonGetter("tz_id")
    public String getTzId ( ) { 
        return this.tzId;
    }
    
    /** SETTER
     * Time zone
     */
    @JsonSetter("tz_id")
    public void setTzId (String value) { 
        this.tzId = value;
    }
 
    /** GETTER
     * Local date and time in unix time
     */
    @JsonGetter("localtime_epoch")
    public Integer getLocaltimeEpoch ( ) { 
        return this.localtimeEpoch;
    }
    
    /** SETTER
     * Local date and time in unix time
     */
    @JsonSetter("localtime_epoch")
    public void setLocaltimeEpoch (Integer value) { 
        this.localtimeEpoch = value;
    }
 
    /** GETTER
     * Local date and time
     */
    @JsonGetter("localtime")
    public String getLocaltime ( ) { 
        return this.localtime;
    }
    
    /** SETTER
     * Local date and time
     */
    @JsonSetter("localtime")
    public void setLocaltime (String value) { 
        this.localtime = value;
    }
 
}
