package com.letsEat.service;

import com.letsEat.model.Restaurant;
import com.letsEat.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.UUID;

@Service
public class RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;

    //create operation
    public Restaurant create(String name, String pricePoints, String category){
        UUID id = UUID.randomUUID();
        return restaurantRepository.save(new Restaurant(id, name, pricePoints, category));
    }

    //Retrieve operation
    public List<Restaurant> getAll(){
        List<Restaurant> l = restaurantRepository.findAll();
        l.sort(Comparator.comparing(Restaurant::getName));
        return l;
    }

    public Restaurant getByName(String name){
        return restaurantRepository.findByName(name);
    }

    public List<Restaurant> getByCategory(String category){
        List<Restaurant> l = restaurantRepository.findByCategory(category);
        l.sort(Comparator.comparing(Restaurant::getName));
        return l;
    }

    public List<Restaurant> getByPricePoints(String pricePoints){
        List<Restaurant> l =  restaurantRepository.findByPricePoints(pricePoints);
        l.sort(Comparator.comparing(Restaurant::getName));
        return l;
    }

    //Update operation
    public Restaurant update(String name, String pricePoints, String category) {
        Restaurant r = restaurantRepository.findByName(name);
        r.setPricePoints(pricePoints);
        r.setCategory(category);
        return restaurantRepository.save(r);
    }

    //Delete operation
    public void deleteAll() {
        restaurantRepository.deleteAll();
    }

    public void delete(String name){
        Restaurant r = restaurantRepository.findByName(name);
        restaurantRepository.delete(r);
    }
}