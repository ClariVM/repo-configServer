package com.clari.citiesservice.service;

import com.clari.citiesservice.dto.CityDTO;

public interface ICityService {

    public CityDTO getCitiesHotels(String name, String country);
}
