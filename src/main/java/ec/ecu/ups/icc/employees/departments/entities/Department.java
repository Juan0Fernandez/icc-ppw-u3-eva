package ec.ecu.ups.icc.employees.departments.entities;

import java.util.List;

import ec.ecu.ups.icc.employees.companies.entities.Company;
import ec.ecu.ups.icc.employees.employees.entities.Employee;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "departments")
public class Department {
    private Long id;
    private String name;
    private double budget;
    private Character active;
    private Company company;
    private List<Employee> employees;

    private Department() {
    }
    private Department(Long id, String name, double budget, Character active, Company company,
            List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.budget = budget;
        this.active = active;
        this.company = company;
        this.employees = employees;
    }

    // Getters and Setters
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
    public Character getActive() {
        return active;
    }
    public void setActive(Character active) {
        this.active = active;
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
    


}
