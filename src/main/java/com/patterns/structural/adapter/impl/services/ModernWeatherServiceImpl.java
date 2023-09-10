package com.patterns.structural.adapter.impl.services;

/**
 * Create a ModernWeatherServiceImpl representing the modern weather service.
 */
public class ModernWeatherServiceImpl implements ModernWeatherService {
    public String getCurrentWeather() {
        return "Current weather: Cloudy, Temperature: 22°C";
    }
}