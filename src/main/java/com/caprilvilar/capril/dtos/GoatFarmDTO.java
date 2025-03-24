package com.caprilvilar.capril.dtos;

import com.caprilvilar.capril.entities.Address;
import java.util.List;

public class GoatFarmDTO {
    private Long id;
    private String name;
    private Address address;
    private String phoneNumber;
    private String ownerName;
    private List<GoatDTO> goats;

    // Construtor padrão
    public GoatFarmDTO() {
    }

    // Construtor parametrizado
    public GoatFarmDTO(Long id, String name, Address address, String phoneNumber, String ownerName, List<GoatDTO> goats) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.ownerName = ownerName;
        this.goats = goats;
    }

    // Getters e Setters
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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