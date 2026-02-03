package ec.ecu.ups.icc.employees.companies.entities;

import java.util.List;

import ec.ecu.ups.icc.employees.departments.entities.Department;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "companies")
public class Company {
    
    private Long id;
    private String name;
    private String country;
    private Character active;
    private List<Department> departments;


    private Company() {
    }
    private Company(Long id, String name, String country, Character active, List<Department> departments) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.active = active;
        this.departments = departments;
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
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public Character getActive() {
        return active;
    }
    public void setActive(Character active) {
        this.active = active;
    }
    public List<Department> getDepartments() {
        return departments;
    }
    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }


}
