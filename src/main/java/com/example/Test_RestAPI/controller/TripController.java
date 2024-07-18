package com.example.Test_RestAPI.controller;

import com.example.Test_RestAPI.dto.trip.CreateTripDTO;
import com.example.Test_RestAPI.dto.trip.TripDTO;
import com.example.Test_RestAPI.dto.trip.UpdateTripDTO;
import com.example.Test_RestAPI.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/trip")
public class TripController {

    @Autowired
    private TripService tripService;

    @PostMapping
    public TripDTO create(@RequestBody CreateTripDTO createTripDTO){
        return tripService.create(createTripDTO);
    }

    @GetMapping("/{id}")
    public TripDTO getById(@PathVariable long id){
        return tripService.getById(id);
    }

    @PutMapping("/{id}")
    public TripDTO update(@PathVariable long id, @RequestBody UpdateTripDTO updateTripDTO){
        return tripService.update(id, updateTripDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        tripService.delete(id);
    }
}
