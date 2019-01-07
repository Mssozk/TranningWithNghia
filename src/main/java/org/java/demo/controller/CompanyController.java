package org.java.demo.controller;

import org.java.demo.model.Company;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @GetMapping
    public List<Company> findCompanies
}
