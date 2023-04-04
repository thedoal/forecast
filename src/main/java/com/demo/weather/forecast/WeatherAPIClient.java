package com.demo.weather.forecast;

import com.demo.weather.forecast.controller.*;
import com.demo.weather.forecast.http.client.HttpClient;

public class WeatherAPIClient {
    /**
     * Singleton access to APIs controller
     * @return	Returns the APIsController instance 
     */
    public APIsController getAPIs() {
        return APIsController.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public WeatherAPIClient() {
    }

    /**
     * Client initialization constructor 
     */     
    public WeatherAPIClient(String key) {
        this();
        Configuration.key = key;
    }
}