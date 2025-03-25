package com.caprilvilar.capril.dtos;

import java.util.List;

public class GoatFarmDTO {
    private Long id;
    private String name;
    private AddressDTO address;
    private List<PhoneDTO> phones;
    private OwnerNameDTO ownerName; // Usando OwnerNameDTO
    private List<GoatDTO> goats;

    // Construtor padrão
    public GoatFarmDTO() {
    }

    // Construtor parametrizado
    public GoatFarmDTO(Long id, String name, AddressDTO address, List<PhoneDTO> phones, OwnerNameDTO ownerName, List<GoatDTO> goats) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phones = phones;
        this.ownerName = ownerName; // Usando OwnerNameDTO
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

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public List<PhoneDTO> getPhones() {
        return phones;
    }

    public void setPhones(List<PhoneDTO> phones) {
        this.phones = phones;
    }

    public OwnerNameDTO getOwnerName() { // Usando OwnerNameDTO
        return ownerName;
    }

    public void setOwnerName(OwnerNameDTO ownerName) { // Usando OwnerNameDTO
        this.ownerName = ownerName;
    }

    public List<GoatDTO> getGoats() {
        return goats;
    }

    public void setGoats(List<GoatDTO> goats) {
        this.goats = goats;
    }
}