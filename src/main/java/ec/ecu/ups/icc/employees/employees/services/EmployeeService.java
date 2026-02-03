package ec.ecu.ups.icc.employees.employees.services;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import ec.ecu.ups.icc.employees.departments.entities.Department;
import ec.ecu.ups.icc.employees.departments.services.DepartmentService;
import ec.ecu.ups.icc.employees.employees.dtos.EmployeeTransferResponseDto;
import ec.ecu.ups.icc.employees.employees.entities.Employee;
import ec.ecu.ups.icc.employees.employees.repository.EmployeeRepository;
import jakarta.transaction.Transactional;



@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;
    private DepartmentService departmentService;

    @Transactional
    private @Nullable Object getEmployeeById(long id) {
        return employeeRepository.findById(id).orElse(null);  
    }

    
    @Transactional
    public @Nullable Object listarDepartments(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }
    
    @Transactional
    public @Nullable Object transferir(Long id, EmployeeTransferResponseDto request) {
        Employee  employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Empleado no encontrado"));  
        
        Department department = departmentService.buscarPorId(request.getNewDepartmentId(id));

        employee.agregarCompany(department);
        return employeeRepository.save(employee);
    }   
    


    
}
