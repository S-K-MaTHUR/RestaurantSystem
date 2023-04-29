package com.geekster.RestaurantSystem.controller;

import com.geekster.RestaurantSystem.model.Restaurant;
import com.geekster.RestaurantSystem.service.RestaurantService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    RestaurantService restService;

    @PostMapping(value = "/newRestaurant")
    public String addRestaurant(@RequestBody Restaurant restaurant){
        return restService.addRestaurant(restaurant);
    }
   @GetMapping(value = "/restaurantId")
    public Restaurant getRestaurantById(@RequestParam String restaurantId ) {
        return restService.getRestaurantById(restaurantId);
    }
    @GetMapping(value = "/restaurants")
    public List<Restaurant> getRestaurants() {
        return restService.getRestaurants();
    }
    @DeleteMapping(value = "/restaurantId/{restaurantId}")
    public String deleteRestaurant(@PathVariable String restaurantId) {
        return restService.deleteRestaurant(restaurantId);
    }
    @PutMapping(value = "/restaurantId/{restaurantId}")
    public String updateRestaurant(@PathVariable String restaurantId, @Nullable @RequestBody String specialty) {
        return restService.updateRestaurant(restaurantId, specialty);
    }
}
