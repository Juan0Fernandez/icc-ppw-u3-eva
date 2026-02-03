package ec.ecu.ups.icc.employees.employees.dtos;

import java.util.List;

public class EmployeesResponseDto {
    private String companyName;
    private double minSalary;
    private double count;
    private List<EmployeeTransferResponseDto> employees;
    

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getMinSalary() {
        return minSalary;
    }
    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }
    public double getCount() {
        return count;
    }
    public void setCount(double count) {
        this.count = count;
    }
    public List<EmployeeTransferResponseDto> getEmployees() {
        return employees;
    }
    public void setEmployees(List<EmployeeTransferResponseDto> employees) {
        this.employees = employees;
    }

}