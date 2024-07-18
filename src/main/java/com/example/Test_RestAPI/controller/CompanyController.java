package com.example.Test_RestAPI.controller;

import com.example.Test_RestAPI.dto.company.CompanyDTO;
import com.example.Test_RestAPI.dto.company.CreateCompanyDTO;
import com.example.Test_RestAPI.dto.company.UpdateCompanyDTO;
import com.example.Test_RestAPI.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping
    public CompanyDTO create(@RequestBody CreateCompanyDTO createCompanyDTO) {
        return companyService.create(createCompanyDTO);
    }

    @GetMapping("/{id}")
    public CompanyDTO getById(@PathVariable Long id) {
        return companyService.getById(id);
    }

    @PutMapping("/{id}")
    public CompanyDTO update(@PathVariable Long id, @RequestBody UpdateCompanyDTO updateCompanyDTO) {
        return companyService.update(id, updateCompanyDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        companyService.delete(id);
    }

}
