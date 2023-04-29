package com.geekster.RestaurantSystem.model;

import lombok.Data;

@Data
public class Restaurant {

    private String restaurantName;
    private String restaurantId;
    private String restaurantAddress;
    private String restaurantNumber;
    private int restaurantTotalStaffs;
    private String restaurantSpeciality;


    public void setSpecialty(String specialty) {
    }
}
