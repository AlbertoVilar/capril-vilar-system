package com.caprilvilar.capril.dtos;

import com.caprilvilar.capril.entities.Goat;
import com.caprilvilar.capril.entities.GoatStatus;
import java.time.LocalDate;

public class GoatDTO {
    private String registrationNumber;
    private String name;
    private String breeder;
    private String ownerName;
    private String breed;
    private String color;
    private GoatStatus status; // Mudado para GoatStatus
    private String gender;
    private String category;
    private String tod;
    private String toe;
    private LocalDate birthDate;
    private String father;
    private String registrationNumberFather;
    private String mother;
    private String registrationNumberMother;
    private boolean active; // Adicionado o campo active

    public GoatDTO() {
    }

    public GoatDTO(Goat goat) {
        this.registrationNumber = goat.getRegistrationNumber();
        this.name = goat.getName();
        this.breeder = goat.getBreeder();
        this.ownerName = goat.getOwnerName();
        this.breed = goat.getBreed();
        this.color = goat.getColor();
        this.status = goat.getStatus(); // Mantido como GoatStatus
        this.gender = goat.getGender();
        this.category = goat.getCategory();
        this.tod = goat.getTod();
        this.toe = goat.getToe();
        this.birthDate = goat.getBirthDate();
        this.active = goat.isActive();

        // Verifica se os pais não são nulos antes de acessar seus atributos
        this.father = (goat.getFather() != null) ? goat.getFather().getName() : null;
        this.registrationNumberFather = (goat.getFather() != null) ? goat.getFather().getRegistrationNumber() : null;

        this.mother = (goat.getMother() != null) ? goat.getMother().getName() : null;
        this.registrationNumberMother = (goat.getMother() != null) ? goat.getMother().getRegistrationNumber() : null;
    }

    // Getters e Setters
    public String getRegistrationNumber() { return registrationNumber; }
    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getBreeder() { return breeder; }
    public void setBreeder(String breeder) { this.breeder = breeder; }
    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }
    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public GoatStatus getStatus() { return status; }
    public void setStatus(GoatStatus status) { this.status = status; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public String getTod() { return tod; }
    public void setTod(String tod) { this.tod = tod; }
    public String getToe() { return toe; }
    public void setToe(String toe) { this.toe = toe; }
    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }
    public String getFather() { return father; }
    public void setFather(String father) { this.father = father; }
    public String getRegistrationNumberFather() { return registrationNumberFather; }
    public void setRegistrationNumberFather(String registrationNumberFather) { this.registrationNumberFather = registrationNumberFather; }
    public String getMother() { return mother; }
    public void setMother(String mother) { this.mother = mother; }
    public String getRegistrationNumberMother() { return registrationNumberMother; }
    public void setRegistrationNumberMother(String registrationNumberMother) { this.registrationNumberMother = registrationNumberMother; }
    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}