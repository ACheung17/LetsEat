package com.letsEat.repository;

import com.letsEat.model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant, String> {
    public Restaurant findByName(String name);
    public List<Restaurant> findByPricePoints(String pricePoints);
    public List<Restaurant> findByCategory(String category);
}
