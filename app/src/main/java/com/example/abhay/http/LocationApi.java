package com.example.abhay.http;

import com.example.abhay.model.city.City;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface LocationApi {

    @GET("cities/autocomplete?apikey=FdzeQUmdtTdhGupvpAA6hHSV0xqNAgdC")
    Call<ArrayList<City>> getCityData(@Query("q") String cityName);
}
