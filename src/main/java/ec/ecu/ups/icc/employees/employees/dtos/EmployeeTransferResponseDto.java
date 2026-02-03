package ec.ecu.ups.icc.employees.employees.dtos;

import ec.ecu.ups.icc.employees.departments.entities.Department;

public class EmployeeTransferResponseDto {
    private Long employeeId;
    private String employeeName;
    private Department oldDepartment;
    private Department newDepartment;
    private String message;

    public EmployeeTransferResponseDto(Long employeeId, String employeeName, Department oldDepartment, Department newDepartment, String message) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.oldDepartment = oldDepartment;
        this.newDepartment = newDepartment;
        this.message = message;
    }
    public Long getEmployeeId() {
        return employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public Department getOldDepartment() {
        return oldDepartment;
    }
    public Department getNewDepartment() {
        return newDepartment;
    }
    public String getMessage() {
        return message;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public void setOldDepartment(Department oldDepartment) {
        this.oldDepartment = oldDepartment;
    }
    public void setNewDepartment(Department newDepartment) {
        this.newDepartment = newDepartment;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    
}
