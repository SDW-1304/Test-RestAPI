package com.example.Test_RestAPI.dto.company;

import com.example.Test_RestAPI.dto.trip.TripDTO;
import lombok.Data;

@Data
public class CompanyDTO {

    private long id;

    private String name;

    private TripDTO tripDTO;
}
