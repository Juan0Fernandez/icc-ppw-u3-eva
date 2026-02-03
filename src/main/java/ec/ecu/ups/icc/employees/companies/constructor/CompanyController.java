package ec.ecu.ups.icc.employees.companies.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ec.ecu.ups.icc.employees.companies.services.CompanyService;
import java.math.BigDecimal;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/{id}/departments")
    public ResponseEntity<?> listarDepartments(@PathVariable Long id) {
        return ResponseEntity.ok(companyService.getCompanyDepartments(id));
    }

    @GetMapping("/{id}/high-salary-employees")
    public ResponseEntity<?> listarHighSalary(
            @PathVariable Long id,
            @RequestParam(defaultValue = "5000.00") BigDecimal minSalary) {
        return ResponseEntity.ok(companyService.getHighSalaryEmployees(id, minSalary));
    }
}