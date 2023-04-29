package com.geekster.RestaurantSystem.service;

import com.geekster.RestaurantSystem.model.Restaurant;
import com.geekster.RestaurantSystem.repository.RestaurantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RestaurantService {

    @Autowired
    RestaurantDao  restDao;

    public Restaurant getRestaurantById(String restaurantId) {
        return restDao.getRestaurantById(restaurantId);
    }

    public String addRestaurant(Restaurant restaurant) {
        return restDao.addRestaurant(restaurant);
    }

    public List<Restaurant> getRestaurants() {
        return restDao.getRestaurants();
    }

    public String deleteRestaurant(String restaurantId) {
        return restDao.deleteRestaurant(restaurantId);
    }

    public String updateRestaurant(String restaurantId, String specialty) {
        return restDao.updateRestaurant(restaurantId, specialty);
    }
}
