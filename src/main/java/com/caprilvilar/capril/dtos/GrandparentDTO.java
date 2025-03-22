package com.caprilvilar.capril.dtos;

public class GrandparentDTO {
    private String name;
    private String registrationNumber;

    // Construtor padrão necessário para serialização
    public GrandparentDTO() {
    }

    // Construtor com argumentos para facilitar a criação de objetos
    public GrandparentDTO(String name, String registrationNumber) {
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