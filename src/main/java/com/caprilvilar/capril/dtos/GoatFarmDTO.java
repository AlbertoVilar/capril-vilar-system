package com.caprilvilar.capril.dtos;

public class GoatFarmDTO {
    private Long id;
    private String name;
    private Long ownerId;
    private Long addressId;
    private String tod;


    public GoatFarmDTO() {
    }


    public GoatFarmDTO(Long id, String name, Long ownerId, Long addressId, String tod) {
        this.id = id;
        this.name = name;
        this.ownerId = ownerId;
        this.addressId = addressId;
        this.tod = tod;
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

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getTod() {
        return tod;
    }

    public void setTod(String tod) {
        this.tod = tod;
    }
}