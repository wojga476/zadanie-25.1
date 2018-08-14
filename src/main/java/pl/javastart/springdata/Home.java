package pl.javastart.springdata;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Home {

    @Id
    @GeneratedValue
    private Long Id;
    private int number;
    private double surface;

    @ManyToOne

    private AssociationHome associationHome;
    @OneToMany
    private List<Person> person;

    public Home(int numer, double surface, AssociationHome associationHome, List<Person> person) {
        this.number = numer;
        this.surface = surface;
        this.associationHome = associationHome;
        this.person = person;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public AssociationHome getAssociationHome() {
        return associationHome;
    }

    public void setAssociationHome(AssociationHome associationHome) {
        this.associationHome = associationHome;
    }

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }


}
