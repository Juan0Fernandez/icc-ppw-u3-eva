package ec.ecu.ups.icc.employees.employees.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ec.ecu.ups.icc.employees.employees.dtos.EmployeeTransferResponseDto;
import ec.ecu.ups.icc.employees.employees.dtos.EmployeeTransferResponseDto;
import ec.ecu.ups.icc.employees.employees.services.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    @PatchMapping("/{id}/transfer")
    public ResponseEntity<?> transferir(@PathVariable Long id, @RequestBody EmployeeTransferResponseDto request) {
        return ResponseEntity.ok(employeeService.transferir(id, request));
    }
}