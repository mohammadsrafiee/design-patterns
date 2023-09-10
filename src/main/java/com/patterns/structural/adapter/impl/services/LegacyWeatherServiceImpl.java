package com.patterns.structural.adapter.impl.services;

/**
 * Create a LegacyWeatherServiceImplementation representing the legacy weather service.
 */
public class LegacyWeatherServiceImpl implements LegacyWeatherService {
    public String getWeatherInfo() {
        return "Today's weather: Sunny, Temperature: 25°C";
    }
}
