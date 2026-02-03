package ec.ecu.ups.icc.employees.companies.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ec.ecu.ups.icc.employees.companies.entities.Company;


@Repository
public interface CompanyRepository extends JpaRepository<Company , Long> {}