package com.example.Test_RestAPI.service;

import com.example.Test_RestAPI.dto.company.CompanyDTO;
import com.example.Test_RestAPI.dto.company.CreateCompanyDTO;
import com.example.Test_RestAPI.dto.company.UpdateCompanyDTO;
import com.example.Test_RestAPI.dto.trip.CreateTripDTO;
import com.example.Test_RestAPI.dto.trip.TripDTO;
import com.example.Test_RestAPI.dto.trip.UpdateTripDTO;

public interface CompanyService {

    CompanyDTO create(CreateCompanyDTO createCompanyDTO);

    CompanyDTO update(Long id, UpdateCompanyDTO updateCompanyDTO);

    CompanyDTO getById(Long id);

    void delete(Long id);
}
