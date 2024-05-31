package com.clari.citiesservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
public class City {

    private Long city_id;
    private String name;
    private String continent;
    private String country;
    private String state;


}
