package ec.ecu.ups.icc.employees.companies.dtos;

import java.util.List;

import jakarta.validation.constraints.NotEmpty;

public class CompanyDepartmentsDto {
    private long companyId;
    private String companyName;
    private String country;
    private Integer departmentCount;
    @NotEmpty(message = "Debe especificar al menos un departamento")
    private List<Long> departments;
    private Double totalBudget;
    
    public long getCompanyId() {
        return companyId;
    }       
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public Integer getDepartmentCount() {
        return departmentCount;
    }
    public void setDepartmentCount(Integer departmentCount) {
        this.departmentCount = departmentCount;
    }
    public List<Long> getDepartments() {
        return departments;
    }
    public void setDepartments(List<Long> departments) {
        this.departments = departments;
    }
    public Double getTotalBudget() {
        return totalBudget;
    }
    public void setTotalBudget(Double totalBudget) {
        this.totalBudget = totalBudget;
    }
    
}
