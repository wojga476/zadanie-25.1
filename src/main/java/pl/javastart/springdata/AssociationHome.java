package pl.javastart.springdata;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class AssociationHome {

    @Id
    @GeneratedValue
    private Long Id;
    private String nameAssocation;
    @OneToMany
    private List<AddressHome> address;

    @OneToMany
    private List<Home> home;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNameAssocation() {
        return nameAssocation;
    }

    public void setNameAssocation(String nameAssocation) {
        this.nameAssocation = nameAssocation;
    }

    public List<AddressHome> getAddress() {
        return address;
    }

    public void setAddress(List<AddressHome> address) {
        this.address = address;
    }

    public List<Home> getHome() {
        return home;
    }

    public void setHome(List<Home> home) {
        this.home = home;
    }

    public AssociationHome(String nameAssocation, List<AddressHome> address, List<Home> home) {

        this.nameAssocation = nameAssocation;
        this.address = address;
        this.home = home;
    }
}
