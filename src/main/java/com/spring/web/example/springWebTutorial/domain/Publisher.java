package com.spring.web.example.springWebTutorial.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String line1;
    private String city;
    private String state;
    private String zip;
    @OneToMany
    @JoinColumn(name = "publisher_id")
    private Set<Pet> pets = new HashSet<>();

    public Publisher() {
    }

    public Publisher(String name, String line1, String city, String state, String zip) {
        this.name = name;
        this.line1 = line1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

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

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publisher publisher = (Publisher) o;

        if (id != null ? !id.equals(publisher.id) : publisher.id != null) return false;
        if (name != null ? !name.equals(publisher.name) : publisher.name != null) return false;
        if (line1 != null ? !line1.equals(publisher.line1) : publisher.line1 != null) return false;
        if (city != null ? !city.equals(publisher.city) : publisher.city != null) return false;
        if (state != null ? !state.equals(publisher.state) : publisher.state != null) return false;
        return zip != null ? zip.equals(publisher.zip) : publisher.zip == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
