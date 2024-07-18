package com.example.Test_RestAPI.dto.company;

import com.example.Test_RestAPI.dto.trip.TripDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCompanyDTO {

    private String name;

    private TripDTO tripDTO;

    private Long tripId;
}
