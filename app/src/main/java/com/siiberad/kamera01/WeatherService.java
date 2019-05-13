package com.siiberad.kamera01;
import com.siiberad.kamera01.WeatherResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Mushtaq on 05-11-2018.
 */

public interface WeatherService {
    @GET("data/2.5/weather?")
    Call<WeatherResponse> getCurrentWeatherData(@Query("lat") String lat,@Query("lon") String lon, @Query("APPID") String app_id);
}

