package com.example.abhay.http;

import com.example.abhay.model.weather.Weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

;

public interface WeatherAPI {


    @GET("{locationKey}?apikey=FdzeQUmdtTdhGupvpAA6hHSV0xqNAgdC")
    Call<Weather> getWeatherData(@Path("locationKey") String locationKey);
}
