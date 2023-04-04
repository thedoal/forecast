package com.demo.weather.forecast.controller;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.type.TypeReference;
import org.joda.time.LocalDate;

import com.demo.weather.forecast.*;
import com.demo.weather.forecast.model.*;
import com.demo.weather.forecast.exceptions.*;
import com.demo.weather.forecast.http.client.HttpClient;
import com.demo.weather.forecast.http.client.HttpContext;
import com.demo.weather.forecast.http.request.HttpRequest;
import com.demo.weather.forecast.http.response.HttpResponse;
import com.demo.weather.forecast.http.response.HttpStringResponse;
import com.demo.weather.forecast.http.client.APICallBack;
import com.demo.weather.forecast.controller.syncwrapper.APICallBackCatcher;

public class APIsController extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static APIsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the APIsController class 
     */
    public static APIsController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new APIsController();
                }
            }
        }
        return instance;
    }

    /**
     * Forecast weather API method returns upto next 10 day weather forecast and weather alert as json. The data is returned as a Forecast Object.<br />Forecast object contains astronomy data, day weather forecast and hourly interval weather information for a given city.
     * @param    q    Required parameter: Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more.
     * @param    days    Required parameter: Number of days of weather forecast. Value ranges from 1 to 10
     * @param    dt    Optional parameter: Date should be between today and next 10 day in yyyy-MM-dd format
     * @param    unixdt    Optional parameter: Please either pass 'dt' or 'unixdt' and not both in same request.<br />unixdt should be between today and next 10 day in Unix format
     * @param    hour    Optional parameter: Must be in 24 hour. For example 5 pm should be hour=17, 6 am as hour=6
     * @param    lang    Optional parameter: Returns 'condition:text' field in API in the desired language. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check 'lang-code'.
     * @return    Returns the ForecastJsonResponse response from the API call 
     */
    public ForecastJsonResponse getForecastWeather(
                final String q,
                final int days,
                final LocalDate dt,
                final Integer unixdt,
                final Integer hour,
                final String lang
    ) throws Throwable {

        HttpRequest _request = _buildGetForecastWeatherRequest(q, days, dt, unixdt, hour, lang);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleGetForecastWeatherResponse(_context);
    }
    
    /**
     * Forecast weather API method returns upto next 10 day weather forecast and weather alert as json. The data is returned as a Forecast Object.<br />Forecast object contains astronomy data, day weather forecast and hourly interval weather information for a given city.
     * @param    q    Required parameter: Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more.
     * @param    days    Required parameter: Number of days of weather forecast. Value ranges from 1 to 10
     * @param    dt    Optional parameter: Date should be between today and next 10 day in yyyy-MM-dd format
     * @param    unixdt    Optional parameter: Please either pass 'dt' or 'unixdt' and not both in same request.<br />unixdt should be between today and next 10 day in Unix format
     * @param    hour    Optional parameter: Must be in 24 hour. For example 5 pm should be hour=17, 6 am as hour=6
     * @param    lang    Optional parameter: Returns 'condition:text' field in API in the desired language. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check 'lang-code'.
     */
    public void getForecastWeatherAsync(
                final String q,
                final int days,
                final LocalDate dt,
                final Integer unixdt,
                final Integer hour,
                final String lang,
                final APICallBack<ForecastJsonResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGetForecastWeatherRequest(q, days, dt, unixdt, hour, lang);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            ForecastJsonResponse returnValue = _handleGetForecastWeatherResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for getForecastWeather
     */
    private HttpRequest _buildGetForecastWeatherRequest(
                final String q,
                final int days,
                final LocalDate dt,
                final Integer unixdt,
                final Integer hour,
                final String lang) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
                
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/forecast.json");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("q", q);
        _queryParameters.put("days", days);
        if (dt != null) {
            _queryParameters.put("dt", DateTimeHelper.toSimpleDate(dt));
        }
        if (unixdt != null) {
            _queryParameters.put("unixdt", unixdt);
        }
        if (hour != null) {
            _queryParameters.put("hour", hour);
        }
        if (lang != null) {
            _queryParameters.put("lang", lang);
        }
        _queryParameters.put("key", Configuration.key);
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);
        System.out.println(_queryUrl); 
        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for getForecastWeather
     * @return An object of type ForecastJsonResponse
     */
    private ForecastJsonResponse _handleGetForecastWeatherResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //Error handling using HTTP status codes
        int _responseCode = _response.getStatusCode();

        if (_responseCode == 400) {
            throw new APIException("Error code 1003: Parameter 'q' not provided.Error code 1005: API request url is invalid.Error code 1006: No location found matching parameter 'q'Error code 9999: Internal application error.", _context);
        }
        if (_responseCode == 401) {
            throw new APIException("Error code 1002: API key not provided.Error code 2006: API key provided is invalid", _context);
        }
        if (_responseCode == 403) {
            throw new APIException("Error code 2007: API key has exceeded calls per month quota.<br />Error code 2008: API key has been disabled.", _context);
        }
        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        ForecastJsonResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<ForecastJsonResponse>(){});

        return _result;
    }

    

}
