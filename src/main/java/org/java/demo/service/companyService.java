package org.java.demo.service;

import org.java.demo.model.Company;
import org.java.demo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public void createCompany(Company company) {
        companyRepository.save(company);
    }

    public void updateCompany(Company company) {
        companyRepository.save(company);
    }

    @Transactional
    public void deleteCompanyById(int id) {
        companyRepository.deleteById(id);
    }

    public Company findCompanyById(int id) {
        return companyRepository.findById(id);
    }
}
