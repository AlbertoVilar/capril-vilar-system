package com.caprilvilar.capril.dtos;

import com.caprilvilar.capril.dtos.GreatGrandparentDTO;
import com.caprilvilar.capril.dtos.ParentsDTO;

import java.time.LocalDate;
import java.util.List;

public class GoatGenealogyDTO {
    private String registrationNumber;
    private String name;
    private String breed;
    private String color;
    private String status;
    private String gender;
    private String category;
    private String tod;
    private String toe;
    private LocalDate birthDate;
    private boolean active;

    private ParentsDTO parents;
    private List<GrandparentDTO> grandparents;  // Alterado para Lista ✅
    private List<GreatGrandparentDTO> greatGrandparents; // Alterado para Lista ✅

    // Construtor vazio
    public GoatGenealogyDTO() {}

    // Getters e Setters
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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

    public ParentsDTO getParents() {
        return parents;
    }

    public void setParents(ParentsDTO parents) {
        this.parents = parents;
    }

    public List<GrandparentDTO> getGrandparents() {
        return grandparents;
    }

    public void setGrandparents(List<GrandparentDTO> grandparents) {
        this.grandparents = grandparents;
    }

    public List<GreatGrandparentDTO> getGreatGrandparents() {
        return greatGrandparents;
    }

    public void setGreatGrandparents(List<GreatGrandparentDTO> greatGrandparents) {
        this.greatGrandparents = greatGrandparents;
    }
}
