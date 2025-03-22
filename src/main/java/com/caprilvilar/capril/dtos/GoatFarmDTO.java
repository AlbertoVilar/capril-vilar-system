package com.caprilvilar.capril.dtos;

import com.caprilvilar.capril.entities.Address; // Importe a classe Address

import java.util.List;

public class GoatFarmDTO {
    private Long id;
    private String name;
    private Address address; // Modificado para Address
    private String phoneNumber;
    private String ownerName;
    private List<GoatDTO> goats;

    // Construtores, getters e setters
    public GoatFarmDTO() {
    }

    // ... outros getters e setters

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public List<GoatDTO> getGoats() {
        return goats;
    }

    public void setGoats(List<GoatDTO> goats) {
        this.goats = goats;
    }
}