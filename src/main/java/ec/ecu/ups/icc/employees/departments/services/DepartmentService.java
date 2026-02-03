package ec.ecu.ups.icc.employees.departments.services;

import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;
import ec.ecu.ups.icc.employees.departments.repository.DepartmentRepository;

import ec.ecu.ups.icc.employees.departments.dtos.DepartmentWhitEmployeesDto;


@Service
public class DepartmentService {

    private DepartmentRepository departmentRepository;

    public @Nullable Object crear(DepartmentWhitEmployeesDto dto) {
        throw new UnsupportedOperationException("Unimplemented method 'crear'");
    }

    public @Nullable Object listarDepartments(Long id) {
        
        return departmentRepository.findById(id);
    }

    public @Nullable Object nuevoDeparta(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'nuevoDeparta'");
    }
    
}
