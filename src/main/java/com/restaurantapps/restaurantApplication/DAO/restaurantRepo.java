package com.restaurantapps.restaurantApplication.DAO;


import com.restaurantapps.restaurantApplication.Model.RestaurantModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface restaurantRepo extends CrudRepository<RestaurantModel, Integer> {

    public Iterable<RestaurantModel> findByCustName(String custName);

}