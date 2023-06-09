package com.malkfilipp.travelplanner.domain.location;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.malkfilipp.travelplanner.domain.flight.Airport;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "countryId")
    private Country country;

    @NotNull
    private Time timezone;
    @NotNull
    private boolean summerShift;

    @JsonIgnore
    @OneToMany(mappedBy = "city")
    private List<Airport> airports;

    public City() {
    }

    public City(Integer id, String name, Country country,
                Time timezone, boolean summerShift) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.timezone = timezone;
        this.summerShift = summerShift;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Time getTimezone() {
        return timezone;
    }

    public void setTimezone(Time timezone) {
        this.timezone = timezone;
    }

    public boolean isSummerShift() {
        return summerShift;
    }

    public void setSummerShift(boolean summerShift) {
        this.summerShift = summerShift;
    }

    public List<Airport> getAirports() {
        return airports;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + country +
                ", timezone=" + timezone +
                ", summerShift=" + summerShift +
                '}';
    }
}
