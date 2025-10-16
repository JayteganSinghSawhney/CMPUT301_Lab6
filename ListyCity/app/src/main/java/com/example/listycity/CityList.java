package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Jaytegan Singh Sawhney
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * Candidate city to add
     * @throws IllegalArgumentException
     * This is thrown if the city already exists in the list
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This returns a sorted list of cities
     * @return
     * Returns the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This checks if a city exists in the list
     * @param city
     * City to be checked
     * @return
     * Returns true if the city exists in the list
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * This deletes a city from the list
     * @throws IllegalArgumentException
     * This is thrown if the city does not exist in the list
     * @param city
     * City to be deleted
     */
    public void delete(City city) {
        if(!cities.contains(city))
            throw new IllegalArgumentException("City does not exist");
        cities.remove(city);
    }

    /**
     * This returns the number of cities in the list
     * @return
     * Number of cities in the list
     */
    public int countCities() {
        return cities.size();
    }
}
