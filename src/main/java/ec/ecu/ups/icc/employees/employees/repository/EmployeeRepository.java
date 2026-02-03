package ec.ecu.ups.icc.employees.employees.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ec.ecu.ups.icc.employees.employees.entities.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee , Long> {}
