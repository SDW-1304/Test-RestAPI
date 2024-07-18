package com.example.Test_RestAPI.dto.trip;

import com.example.Test_RestAPI.dto.company.CompanyDTO;
import lombok.Data;

import java.util.Date;

@Data
public class TripDTO {

    private long id;

    private int company;

    private String plane;

    private String town_from;

    private String town_to;

    private Date time_out;

    private Date time_in;

    private CompanyDTO companyDTO;
}
