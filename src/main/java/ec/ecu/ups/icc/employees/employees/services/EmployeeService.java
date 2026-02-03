package ec.ecu.ups.icc.employees.employees.services;
import org.jspecify.annotations.Nullable;

import ec.ecu.ups.icc.employees.employees.dtos.EmployeeTransferResponseDto;
import ec.ecu.ups.icc.employees.employees.repository.EmployeeRepository;



public class EmployeeService {

    private EmployeeRepository employeeRepository;
    
    @Override
    @Transactional
    private @Nullable Object getEmployeeById(Long id) {
        return id;  
    }

    
    @Override
    @Transactional
    public @Nullable Object listarDepartments(Long id) {
        return id;
    }
    
    @Override
    @Transactional
    public @Nullable Object transferir(Long id, EmployeeTransferResponseDto request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transferir'");
    }   
    


    
}
