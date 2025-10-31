package com.example.lab08;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    // Will be implemented later using TDD (leave blank for now)
    // public boolean hasCity(City city) { ... }

    /**
     * Check if the city list contains a specific city
     * @param city The city to check
     * @return true if city exists, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Count the number of cities in the list
     * @return The number of cities
     */
    public int countCities() {
        return cities.size();
    }

    /**
     * Remove a city from the list
     * @param city The city to remove
     */
    public void deleteCity(City city) {
        cities.remove(city);
    }

    public int getCount() {
        return cities.size();
    }
}
