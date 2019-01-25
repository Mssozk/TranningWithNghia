package org.java.demo.controller;

import org.java.demo.model.Company;
import org.java.demo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/companies")
    public List<Company> findCompanies() {

        return Collections.emptyList();
    }

    @PostMapping(name = "/")
    public void createCompany(@RequestBody Company company) {
        System.out.println(company);
        companyService.createCompany(company);
    }

    @PutMapping
    public String updateCompany(@RequestBody Company company) {
        System.out.println(company);
        companyService.updateCompany(company);
        return "Company updated";
    }

    @DeleteMapping
    public String deleteCompany(@RequestParam int id) {
        companyService.deleteCompanyById(id);
        return "Company deleted";
    }

    @GetMapping
    public Company findCompany(@RequestParam int id) {
    Company value = null;
    try {
        value = companyService.findCompanyById(id);
        System.out.println("\nCompany found");
    } catch ( Exception e) {
        System.out.println("\nInvalid");
        value = new Company();
    }
    return value;
    }


}
