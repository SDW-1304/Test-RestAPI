package com.example.Test_RestAPI.service;

import com.example.Test_RestAPI.dto.trip.CreateTripDTO;
import com.example.Test_RestAPI.dto.trip.TripDTO;
import com.example.Test_RestAPI.dto.trip.UpdateTripDTO;

public interface TripService {

    TripDTO create(CreateTripDTO createTripDTO);

    TripDTO update(Long id, UpdateTripDTO updateTripDTO);

    TripDTO getById(Long id);

    void delete(Long id);


}
