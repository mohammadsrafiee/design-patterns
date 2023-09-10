package com.patterns.structural.adapter.impl.adapter;

import com.patterns.structural.adapter.impl.services.LegacyWeatherService;
import com.patterns.structural.adapter.impl.services.ModernWeatherService;

/**
 * Create an Adapter that adapts the LegacyWeatherService to the ModernWeatherService interface.
 */
public class LegacyWeatherAdapter implements ModernWeatherService {
    private final LegacyWeatherService legacyService;

    public LegacyWeatherAdapter(LegacyWeatherService legacyService) {
        this.legacyService = legacyService;
    }

    public String getCurrentWeather() {
        // Adapt the legacy weather service to the modern interface.
        String legacyWeatherInfo = legacyService.getWeatherInfo();
        String[] parts = legacyWeatherInfo.split(",");
        String temperature = parts[1].trim().substring("Temperature:".length());
        return "Current weather: " + parts[0] + ", Temperature: " + temperature;
    }
}
