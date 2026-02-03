package ec.ecu.ups.icc.employees.departments.dtos;

import java.util.List;

import ec.ecu.ups.icc.employees.companies.entities.Company;
import ec.ecu.ups.icc.employees.employees.entities.Employee;

public class DepartmentWhitEmployeesDto {
    private Long id;
    private String name;
    private double budget;
    private Company company;

    private List<Employee> employees;
    private Integer count;
    private Double totalSalaries;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBudget() {
        return budget;
    }
    public void setBudget(double budget) {
        this.budget = budget;
    }
    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }
    public List<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
    public Double getTotalSalaries() {
        return totalSalaries;
    }
    public void setTotalSalaries(Double totalSalaries) {
        this.totalSalaries = totalSalaries;
    }
    

}
