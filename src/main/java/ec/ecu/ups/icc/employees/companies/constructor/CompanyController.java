package ec.ecu.ups.icc.employees.companies.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.ecu.ups.icc.employees.companies.dtos.CompanySimpleDto;
import ec.ecu.ups.icc.employees.companies.services.CompanyService;  


@RestController
@RequestMapping("/api/companies")
public class CompanyController {
    

    @Autowired
    private CompanyService companyService;

     @PostMapping
    public ResponseEntity<?> crearCurso(@RequestBody CompanySimpleDto dto) {
        return (ResponseEntity<?>) ResponseEntity.ok();
    }

    @GetMapping
    public ResponseEntity<?> listarCompanies() {
        return ResponseEntity.ok(companyService.listarTodos());
    }

    @PostMapping("/{id}/companies")
    public ResponseEntity<?> agregarTema(@PathVariable Long id, @RequestBody CompanySimpleDto dto) {
        return ResponseEntity.ok(companyService.agregarCompany(id, dto));
    }

    
    @GetMapping("/api/companies/{id}/higt-salary-employees")
    public ResponseEntity<?> listarDepartments(@PathVariable Long id) {
        return ResponseEntity.ok(companyService.listarDepartments(id));
    }



}
