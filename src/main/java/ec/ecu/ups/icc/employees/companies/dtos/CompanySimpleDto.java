package ec.ecu.ups.icc.employees.companies.dtos;

public class CompanySimpleDto {
    private long id;
    private String name;
    private String country;
    private Character active;

    public long getId() {
        return id;
    }   
    public void setId(long id) {
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
    

}
