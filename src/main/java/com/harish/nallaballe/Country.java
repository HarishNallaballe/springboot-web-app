package com.harish.nallaballe;

import java.util.HashSet;
import java.util.Set;

//import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="countries")
public class Country {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="name")
    private String name;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<State> states=new HashSet<State>();

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<State> getStates() {
        return this.states;
    }

    public void setStates(Set<State> states) {
        this.states = states;
    }


    public Country() {
    }

    public Country(String name) {
        this.name=name;
    }
    public Country(String name,Set<State> state) {
        this.name=name;
        this.states=state;
    }

}
