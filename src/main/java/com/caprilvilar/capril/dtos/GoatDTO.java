package com.caprilvilar.capril.dtos;

import com.caprilvilar.capril.entities.Goat;
import java.time.LocalDate;

public class GoatDTO {
    private String registrationNumber;
    private String name;
    private String breeder;
    private String ownerName;
    private String breed;
    private String color;
    private String status;
    private String gender;
    private String category;
    private String tod;
    private String toe;
    private LocalDate birthDate;
    private String father;
    private String registrationNumberFather;
    private String mother;
    private String registrationNumberMother;

    public GoatDTO() {
    }

    public GoatDTO(Goat goat) {
        this.registrationNumber = goat.getRegistrationNumber();
        this.name = goat.getName();
        this.breeder = goat.getBreeder();
        this.ownerName = goat.getOwnerName();
        this.breed = goat.getBreed();
        this.color = goat.getColor();
        this.status = goat.getStatus();
        this.gender = goat.getGender();
        this.category = goat.getCategory();
        this.tod = goat.getTod();
        this.toe = goat.getToe();
        this.birthDate = goat.getBirthDate();

        // Verifica se os pais não são nulos antes de acessar seus atributos
        this.father = (goat.getFather() != null) ? goat.getFather().getName() : null;
        this.registrationNumberFather = (goat.getFather() != null) ? goat.getFather().getRegistrationNumber() : null;

        this.mother = (goat.getMother() != null) ? goat.getMother().getName() : null;
        this.registrationNumberMother = (goat.getMother() != null) ? goat.getMother().getRegistrationNumber() : null;
    }

    // Getters
    public String getRegistrationNumber() { return registrationNumber; }
    public String getName() { return name; }
    public String getBreeder() { return breeder; }
    public String getOwnerName() { return ownerName; }
    public String getBreed() { return breed; }
    public String getColor() { return color; }
    public String getStatus() { return status; }
    public String getGender() { return gender; }
    public String getCategory() { return category; }
    public String getTod() { return tod; }
    public String getToe() { return toe; }
    public LocalDate getBirthDate() { return birthDate; }
    public String getFather() { return father; }
    public String getRegistrationNumberFather() { return registrationNumberFather; }
    public String getMother() { return mother; }
    public String getRegistrationNumberMother() { return registrationNumberMother; }
}
