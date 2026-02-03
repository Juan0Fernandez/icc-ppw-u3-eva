package ec.ecu.ups.icc.employees.companies.services;

import org.jspecify.annotations.Nullable;

import ec.ecu.ups.icc.employees.companies.dtos.CompanySimpleDto;
import ec.ecu.ups.icc.employees.companies.entities.Company;
import ec.ecu.ups.icc.employees.companies.repository.CompanyRepository;

public class CompanyService {

    private CompanyRepository companiesRepository;

    public void crear(CompanySimpleDto dto) {
        this.agregarCompany(dto.getId(), dto);
    }

    public @Nullable Object listarTodos() {
        return companiesRepository.findAll();
    }

    public @Nullable Object agregarCompany(Long id, CompanySimpleDto dto) {
        Company companies = companiesRepository.findById(id).orElse(null);
        if (companies != null) {
            companies.setName(dto.getName());
            companies.setCountry(dto.getCountry());
            companies.setActive(dto.getActive());
            companiesRepository.save(companies);
        }
        return companies;
    }

    public @Nullable Object listarDepartments(Long id) {
        return companiesRepository.findById(id);
    }
    
}
