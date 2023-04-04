package com.demo.weather.forecast.model;

public class ResponseRest {
   
    private String date;
    private String forecast;

    /**
     * @return LocalDate return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return String return the forecast
     */
    public String getForecast() {
        return forecast;
    }

    /**
     * @param forecast the forecast to set
     */
    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

}