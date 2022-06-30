package com.restaurantapps.restaurantApplication.Controller;

import com.restaurantapps.restaurantApplication.DAO.restaurantRepo;
import com.restaurantapps.restaurantApplication.Model.RestaurantModel;
import com.restaurantapps.restaurantApplication.Service.restaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/restaurantRun")
public class restaurantController {

        @Autowired
        restaurantService reestaurantService;

        @Autowired
        restaurantRepo RestaurantRepo;

        @GetMapping(value = "/all")
        public Iterable<RestaurantModel> getAllTickets(){
            return reestaurantService.getAllCustomerDetail();
        }

        @PostMapping(value = "/create")
        public RestaurantModel createCustomer (@RequestBody RestaurantModel restaurantModel){
            return reestaurantService.createCustomer(restaurantModel);
        }
    }

