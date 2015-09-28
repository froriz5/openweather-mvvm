package com.sapient.froriz.openweather_mvvm.Models;

import android.databinding.BaseObservable;

import java.util.Observable;

/**
 * Created by froriz on 9/28/15.
 */
public class WeatherEntry extends BaseObservable{
    private String location;
    private double currentTemp;
    private double low;
    private double high;
    private String description;

    /**
     * Constructor to create a Weather Entry POJO.
     * @param location City name.
     * @param currentTemp Current Temperature.
     * @param low Low of the day.
     * @param high High of the day.
     * @param description Description (i.e. Cloudy, Sunny, etc...)
     */
    public WeatherEntry(String location, double currentTemp, double low,
                        double high, String description) {
        this.location = location;
        this.currentTemp = currentTemp;
        this.low = low;
        this.high = high;
        this.description = description;
    }

    @Override
    public String toString() {
        return location +" ---- "+
                "Current: " + currentTemp + " --- " +
                "Low: " + low + " --- " +
                "High: " + high;
//                description;
    }

    /**
     * Factory method for creating a dummy Weather Entry POJO.
     * @return
     */
    public static WeatherEntry createWeatherEntry() {
        WeatherEntry weatherEntry = new WeatherEntry("Chicago", 65, 55, 70, "Cloudy");
        return weatherEntry;
    }

    /**
     * Factory method for creating a WeatherEntry model with given data.
     * @param location City name
     * @param root JSON object representing the root object from Open Weather API Response.
     * @return WeatherEntry with the provided data.
     */
//    public static WeatherEntry createWeatherEntry(String location, OpenWeatherMapRoot root) {
//        WeatherEntry weatherEntry = new WeatherEntry(
//                location,
//                root.getMain().getCurrentTemp(),
//                root.getMain().getLow(),
//                root.getMain().getMax(),
//                root.getWeather().get(0).getDescription()
//        );
//        return weatherEntry;
//    }
}
