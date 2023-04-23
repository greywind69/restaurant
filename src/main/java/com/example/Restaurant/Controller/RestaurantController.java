package com.example.Restaurant.Controller;
import com.example.Restaurant.Model.Restaurant;
import com.example.Restaurant.Service.RestaurantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestaurantController {
    private final RestaurantService restService;
    public RestaurantController(RestaurantService restService)
    {
        this.restService=restService;
    }
    @GetMapping("find-all")
    public List<Restaurant> findAllRest()
    {
        return restService.findAll();
    }
    @GetMapping("name/{name}/getBy_name")
    public Restaurant findByIdRest(@PathVariable String name)
    {
        return restService.getBy_Name(name);
    }
    @PostMapping("/Add_Rest")
    public void AddRest( @RequestBody Restaurant restaurant){

        restService.addRest(restaurant);
    }
    @DeleteMapping("/Delete-Restaurant/name/{name}")
    public void DeelRest(@PathVariable String name){
        restService.deleteRest(name);
    }



}