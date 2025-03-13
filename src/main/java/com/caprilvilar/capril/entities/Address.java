package com.caprilvilar.capril.entities;

import com.caprilvilar.capril.GoatFarm;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;

    @OneToMany(mappedBy = "address", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GoatFarm> goatFarms = new ArrayList<>();


    public Address() {
    }


    public Address(Long id, String street, String city, String state, String postalCode, String country) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Método para acessar a lista de goatFarms (apenas leitura)
    public List<GoatFarm> getGoatFarms() {
        return goatFarms;
    }

    // Métodos para adicionar e remover goatFarms
    public void addGoatFarm(GoatFarm goatFarm) {
        goatFarms.add(goatFarm);
        goatFarm.setAddress(this); // Mantém o relacionamento bidirecional
    }

    public void removeGoatFarm(GoatFarm goatFarm) {
        goatFarms.remove(goatFarm);
        goatFarm.setAddress(null); // Mantém o relacionamento bidirecional
    }
}