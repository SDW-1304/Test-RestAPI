package com.example.Test_RestAPI.mapper;

import com.example.Test_RestAPI.data.Company;
import com.example.Test_RestAPI.dto.company.CompanyDTO;
import com.example.Test_RestAPI.dto.company.CreateCompanyDTO;
import com.example.Test_RestAPI.dto.company.UpdateCompanyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompanyMapper {

    @Autowired
    private TripMapper tripMapper;

    public Company toCreateEntity(CreateCompanyDTO createCompanyDTO) {
        Company company = new Company();

        company.setName(createCompanyDTO.getName());

        return company;
    }

    public Company toUpdateEntity(Company company, UpdateCompanyDTO updateCompanyDTO) {
        company.setName(updateCompanyDTO.getName());

        return company;
    }

    public CompanyDTO toDTO(Company company) {

        CompanyDTO companyDTO = new CompanyDTO();

        companyDTO.setId(company.getId());
        companyDTO.setName(company.getName());
        companyDTO.setTripDTO(tripMapper.toDTO(company.getTrip()));


        return companyDTO;
    }

    public List<CompanyDTO> toDTO(List<Company> companyList) {
        List<CompanyDTO> companyDTOList = new ArrayList<>();

        companyList.forEach(company -> {
            CompanyDTO companyDTO = toDTO(company);

            companyDTO.setId(company.getId());
            companyDTO.setName(company.getName());
            companyDTO.setTripDTO(tripMapper.toDTO(company.getTrip()));

            companyDTOList.add(companyDTO);
        });

        return companyDTOList;
    }
}
