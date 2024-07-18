package com.example.Test_RestAPI.mapper;

import com.example.Test_RestAPI.data.Trip;
import com.example.Test_RestAPI.dto.trip.CreateTripDTO;
import com.example.Test_RestAPI.dto.trip.TripDTO;
import com.example.Test_RestAPI.dto.trip.UpdateTripDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class TripMapper {

    public Trip toCreateEntity(CreateTripDTO createTripDTO) {
        Trip trip = new Trip();

        trip.setCompany(createTripDTO.getCompany());
        trip.setPlane(createTripDTO.getPlane());
        trip.setTown_from(createTripDTO.getTown_from());
        trip.setTown_to(createTripDTO.getTown_to());
        trip.setTime_in(createTripDTO.getTime_in());
        trip.setTime_out(createTripDTO.getTime_out());

        return trip;
    }

    public Trip toUpdateEntity(Trip trip, UpdateTripDTO updateTripDTO) {

        trip.setCompany(updateTripDTO.getCompany());
        trip.setPlane(updateTripDTO.getPlane());
        trip.setTown_from(updateTripDTO.getTown_from());
        trip.setTown_to(updateTripDTO.getTown_to());
        trip.setTime_in(updateTripDTO.getTime_in());
        trip.setTime_out(updateTripDTO.getTime_out());

        return trip;
    }

    public TripDTO toDTO(Trip trip) {
        TripDTO tripDTO = new TripDTO();

        tripDTO.setCompany(trip.getCompany());
        tripDTO.setPlane(trip.getPlane());
        tripDTO.setTown_from(trip.getTown_from());
        tripDTO.setTown_to(trip.getTown_to());
        tripDTO.setTime_in(trip.getTime_in());
        tripDTO.setTime_out(trip.getTime_out());
        tripDTO.setId(trip.getId());

        return tripDTO;
    }

    public List<TripDTO> toDTO(List<Trip> tripList) {
        List<TripDTO> tripDTOList = new ArrayList<>();
        tripList.forEach(trip -> {
            TripDTO tripDTO = new TripDTO();

            tripDTO.setId(trip.getId());
            tripDTO.setCompany(trip.getCompany());
            tripDTO.setPlane(trip.getPlane());
            tripDTO.setTown_from(trip.getTown_from());
            tripDTO.setTown_to(trip.getTown_to());
            tripDTO.setTime_in(trip.getTime_in());
            tripDTO.setTime_out(trip.getTime_out());

            tripDTOList.add(tripDTO);
        });
        return tripDTOList;
    }
}
