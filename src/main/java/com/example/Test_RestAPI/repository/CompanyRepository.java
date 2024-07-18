package com.example.Test_RestAPI.repository;

import com.example.Test_RestAPI.data.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long>{
}
