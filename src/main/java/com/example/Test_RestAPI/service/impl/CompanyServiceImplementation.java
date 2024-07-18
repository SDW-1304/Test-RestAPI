package com.example.Test_RestAPI.service.impl;

import com.example.Test_RestAPI.data.Company;
import com.example.Test_RestAPI.data.Trip;
import com.example.Test_RestAPI.dto.company.CompanyDTO;
import com.example.Test_RestAPI.dto.company.CreateCompanyDTO;
import com.example.Test_RestAPI.dto.company.UpdateCompanyDTO;
import com.example.Test_RestAPI.mapper.CompanyMapper;
import com.example.Test_RestAPI.mapper.TripMapper;
import com.example.Test_RestAPI.repository.CompanyRepository;
import com.example.Test_RestAPI.repository.TripRepository;
import com.example.Test_RestAPI.service.CompanyService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CompanyServiceImplementation implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private TripRepository tripRepository;

    @Autowired
    private CompanyMapper companyMapper;

    @Autowired
    private TripMapper tripMapper;

    @Override
    public CompanyDTO create(CreateCompanyDTO createCompanyDTO) {

        Company company = companyMapper.toCreateEntity(createCompanyDTO);

        Trip trip = tripRepository.getReferenceById(createCompanyDTO.getTripId());
        company.setTrip(trip);

        return companyMapper.toDTO(companyRepository.save(company));
    }

    @Override
    public CompanyDTO update(Long id, UpdateCompanyDTO updateCompanyDTO) {

        Company company = companyRepository.getReferenceById(id);

        company = companyMapper.toUpdateEntity(company, updateCompanyDTO);

        Long tripId = updateCompanyDTO.getTripId();

        if (tripId!= null) {
            Trip trip = tripRepository.getById(tripId);
            company.setTrip(trip);
        }

        return companyMapper.toDTO(companyRepository.save(company));
    }

    @Override
    public CompanyDTO getById(Long id) {
        return companyMapper.toDTO(companyRepository.getReferenceById(id));
    }

    @Override
    public void delete(Long id) {
        companyRepository.deleteById(id);
    }
}
