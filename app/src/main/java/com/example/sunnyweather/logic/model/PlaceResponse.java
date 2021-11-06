package com.example.sunnyweather.logic.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PlaceResponse {

    class Location {

        String lng; // 经度

        String lat; // 维度

        public Location(){}

        public Location(String lng, String lat) {
            this.lng = lng;
            this.lat = lat;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }
    }

    public class Place {

        String name;

        Location location;

        @SerializedName("formatted_address")
        String address;

        public Place(){}

        public Place(String name, Location location, String address) {
            this.name = name;
            this.location = location;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    String status;

    List<Place> places;

    public PlaceResponse(){}

    public PlaceResponse(String status, List<Place> places) {
        this.status = status;
        this.places = places;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }
}
