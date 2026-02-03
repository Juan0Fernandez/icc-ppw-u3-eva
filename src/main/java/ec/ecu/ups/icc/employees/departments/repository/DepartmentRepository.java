package ec.ecu.ups.icc.employees.departments.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ec.ecu.ups.icc.employees.departments.entities.Department;


@Repository
public interface DepartmentRepository extends JpaRepository<Department , Long> {}
