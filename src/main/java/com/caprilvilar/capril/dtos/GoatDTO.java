package com.caprilvilar.capril.dtos;

import com.caprilvilar.capril.entities.GoatStatus;


import java.time.LocalDate;
import java.util.List;


public class GoatDTO {

    private String registrationNumber;
    private String name;
    private String breed;
    private String color;
    private GoatStatus status;
    private String gender;
    private String category;
    private String tod;
    private String toe;
    private LocalDate birthDate;
    private boolean active;

    public GoatDTO() {
    }

    public GoatDTO(String registrationNumber, String name, String breed,
                   String color, GoatStatus status, String gender, String category,
                   String tod, String toe, LocalDate birthDate, boolean active) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.status = status;
        this.gender = gender;
        this.category = category;
        this.tod = tod;
        this.toe = toe;
        this.birthDate = birthDate;
        this.active = active;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
