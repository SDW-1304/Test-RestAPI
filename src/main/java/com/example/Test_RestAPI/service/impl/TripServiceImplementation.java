package com.example.Test_RestAPI.service.impl;

import com.example.Test_RestAPI.data.Trip;
import com.example.Test_RestAPI.dto.trip.CreateTripDTO;
import com.example.Test_RestAPI.dto.trip.TripDTO;
import com.example.Test_RestAPI.dto.trip.UpdateTripDTO;
import com.example.Test_RestAPI.mapper.TripMapper;
import com.example.Test_RestAPI.repository.TripRepository;
import com.example.Test_RestAPI.service.TripService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TripServiceImplementation implements TripService {

    @Autowired
    private TripRepository tripRepository;

    @Autowired
    private TripMapper tripMapper;

    @Override
    public TripDTO create(CreateTripDTO createTripDTO) {
        Trip trip = tripMapper.toCreateEntity(createTripDTO);

        return tripMapper.toDTO(tripRepository.save(trip));
    }

    @Override
    public TripDTO update(Long id, UpdateTripDTO updateTripDTO) {
        Trip trip = tripRepository.getReferenceById(id);
        trip = tripMapper.toUpdateEntity(trip, updateTripDTO);

        return tripMapper.toDTO(tripRepository.save(trip));
    }

    @Override
    public TripDTO getById(Long id) {
        return tripMapper.toDTO(tripRepository.getReferenceById(id));
    }

    @Override
    public void delete(Long id){
        tripRepository.deleteById(id);
    }

}
