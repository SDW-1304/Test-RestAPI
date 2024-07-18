package com.example.Test_RestAPI.dto.trip;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateTripDTO {

    private int company;

    private String plane;

    private String town_from;

    private String town_to;

    private Date time_out;

    private Date time_in;

}
