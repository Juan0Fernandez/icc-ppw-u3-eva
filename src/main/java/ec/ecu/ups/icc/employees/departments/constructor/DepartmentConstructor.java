package ec.ecu.ups.icc.employees.departments.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.ecu.ups.icc.employees.departments.services.DepartmentService;


@RestController
@RequestMapping("/api/departments")
public class DepartmentConstructor {
    @Autowired
    private DepartmentService departmentService;


    @PostMapping
    public ResponseEntity<?> crearDepartament(@RequestBody DepartmentWhitEmployeesDto dto) {
        return ResponseEntity.ok(departmentService.crear(dto));
    }

    @PostMapping("/{id}/matricular/{estudianteId}")
    public ResponseEntity<?> matricular(@PathVariable Long id, @PathVariable Long employeeId) {
        return ResponseEntity.ok(departmentService.nuevoDeparta(id));
    }
}
