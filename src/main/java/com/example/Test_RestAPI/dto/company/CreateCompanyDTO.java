package com.example.Test_RestAPI.dto.company;

import com.example.Test_RestAPI.dto.trip.TripDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateCompanyDTO {

    private String name;

    private Long tripId;
}
