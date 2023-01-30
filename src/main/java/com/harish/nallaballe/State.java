package com.harish.nallaballe;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="state")
public class State {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer Id;
   private String stateName;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name="countryId")
   private Country country;


    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getStateName() {
        return this.stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Country getCountry() {
        return this.country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public State() {
    }


    public State(String stateName, Country country) {
        this.stateName = stateName;
        this.country = country;
    }


}
