package com.caprilvilar.capril.dtos;

public class GreatGrandparentDTO {
    private String name;
    private String registrationNumber;

    // ✅ Construtor correto para aceitar dois argumentos
    public GreatGrandparentDTO(String name, String registrationNumber) {
        this.name = name;
        this.registrationNumber = registrationNumber;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
