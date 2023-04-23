package com.example.Restaurant.Service;

import com.example.Restaurant.Model.Restaurant;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.*;

@Service
public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();
    static{
        restaurants.add(new Restaurant("Punjab Restaurant","Punjab road",1,"dum biryani",20,100,2000.2));
        restaurants.add(new Restaurant("Hyderabad Restaurant","Hyderabad road",2,"ambur biryani",25,150,3000.5));
        restaurants.add(new Restaurant("DelhiRestaurant","Delhi",1,"chilli chicken",30,180,5000.7));
    }
    public List<Restaurant> findAll(){
        return restaurants;
    }
    public Restaurant getBy_Name(String name){
        for(Restaurant rests:restaurants) {
            if(rests.getName().equals(name)){
                return rests;
            }
        }
        return restaurants.get(1);
    }
    public void addRest(Restaurant newa)
    {
        restaurants.add(newa);
    }
    public void deleteRest(String name)
    {
        Restaurant temp=getBy_Name(name);
        restaurants.remove(temp);

    }
}