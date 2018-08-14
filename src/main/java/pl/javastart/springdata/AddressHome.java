package pl.javastart.springdata;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class AddressHome {

    @Id
    @GeneratedValue
    private Long Id;
    private String street;
    private int nr;

    @OneToMany(mappedBy = "address")

    private List<AssociationHome> associationHomes;

    public AddressHome(Long id, String ulica, int nr, List<AssociationHome> associationHomes) {
        Id = id;
        this.street = ulica;
        this.nr = nr;
        this.associationHomes = associationHomes;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public List<AssociationHome> getAssociationHomes() {
        return associationHomes;
    }

    public void setAssociationHomes(List<AssociationHome> associationHomes) {
        this.associationHomes = associationHomes;
    }
}
