package com.caprilvilar.capril.dtos;

import com.caprilvilar.capril.entities.GoatStatus;
import java.time.LocalDate;

public class GoatDTO {
    private String registrationNumber;
    private String name;
    private String breeder;
    private String ownerName;
    private String breed;
    private String color;
    private GoatStatus status;
    private String gender;
    private String category;
    private String tod;
    private String toe;
    private LocalDate birthDate;
    private String father;
    private String registrationNumberFather;
    private String mother;
    private String registrationNumberMother;
    private boolean active;
    private GoatFarmDTO goatFarm;

    public GoatDTO() {
    }

    public GoatDTO(String registrationNumber, String name, String breeder, String ownerName, String breed, String
                           color, GoatStatus status, String gender, String category, String tod, String toe, LocalDate birthDate,
                   String father, String registrationNumberFather, String mother, String registrationNumberMother,
                   boolean active, GoatFarmDTO goatFarm) {

        this.registrationNumber = registrationNumber;
        this.name = name;
        this.breeder = breeder;
        this.ownerName = ownerName;
        this.breed = breed;
        this.color = color;
        this.status = status;
        this.gender = gender;
        this.category = category;
        this.tod = tod;
        this.toe = toe;
        this.birthDate = birthDate;
        this.father = father;
        this.registrationNumberFather = registrationNumberFather;
        this.mother = mother;
        this.registrationNumberMother = registrationNumberMother;
        this.active = active;
        this.goatFarm = goatFarm;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreeder() {
        return breeder;
    }

    public void setBreeder(String breeder) {
        this.breeder = breeder;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public GoatStatus getStatus() {
        return status;
    }

    public void setStatus(GoatStatus status) {
        this.status = status;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTod() {
        return tod;
    }

    public void setTod(String tod) {
        this.tod = tod;
    }

    public String getToe() {
        return toe;
    }

    public void setToe(String toe) {
        this.toe = toe;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getRegistrationNumberFather() {
        return registrationNumberFather;
    }

    public void setRegistrationNumberFather(String registrationNumberFather) {
        this.registrationNumberFather = registrationNumberFather;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getRegistrationNumberMother() {
        return registrationNumberMother;
    }

    public void setRegistrationNumberMother(String registrationNumberMother) {
        this.registrationNumberMother = registrationNumberMother;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public GoatFarmDTO getGoatFarm() {
        return goatFarm;
    }

    public void setGoatFarm(GoatFarmDTO goatFarm) {
        this.goatFarm = goatFarm;
    }
}