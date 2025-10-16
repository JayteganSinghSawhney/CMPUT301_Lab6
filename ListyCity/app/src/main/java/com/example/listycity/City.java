package com.example.listycity;

import java.util.Objects;

/**
 * @author Jaytegan Singh Sawhney
 * This is a class that defines a city
 */
public class City implements Comparable<Object> {
    private String city;
    private String province;

    /**
     * Constructor for the city class
     * @param city
     * Name of the city
     * @param province
     * Name of the province
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * @return
     * Returns the name of the city
     */
    public String getCityName() {
        return this.city;
    }

    /**
     * @return
     * Returns the name of the province
     */
    public String getProvinceName() {
        return this.province;
    }

    /**
     * @param o
     * @return
     * Compares the city names
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    /**
     * @param o
     * @return
     * Compares the city and province names
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city1 = (City) o;

        return city.equals(city1.city) && province.equals(city1.province);
    }

    /**
     * @return
     * Returns the hash code for the city
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
