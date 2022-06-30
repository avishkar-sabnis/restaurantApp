package com.restaurantapps.restaurantApplication.Service;

import com.restaurantapps.restaurantApplication.DAO.restaurantRepo;
import com.restaurantapps.restaurantApplication.Model.RestaurantModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class restaurantService {

    @Autowired
    restaurantRepo RestaurantRepo;


    public Iterable<RestaurantModel> getAllCustomerDetail(){
        return RestaurantRepo.findAll();
    }

    public RestaurantModel getRestaurantDetail(Integer orderID) {
        return RestaurantRepo.findById(orderID).orElse(new RestaurantModel());
    }

    public RestaurantModel createCustomer (RestaurantModel restaurantModel){
        return RestaurantRepo.save(restaurantModel);
    }

    public Iterable<RestaurantModel> findByCustName(String custName){
        return RestaurantRepo.findByCustName(custName);
    }

}

