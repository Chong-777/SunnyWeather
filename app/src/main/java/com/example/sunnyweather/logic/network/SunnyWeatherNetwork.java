package com.example.sunnyweather.logic.network;

import com.example.sunnyweather.logic.model.PlaceResponse;

import retrofit2.Call;

public class SunnyWeatherNetwork {

    private PlaceService placeService = ServiceCreator.getUniqueInstance()
            .create(PlaceService.class);

    public Call<PlaceResponse> searchPlace(String query) {
        return placeService.searchPlaces(query);
    }

}
