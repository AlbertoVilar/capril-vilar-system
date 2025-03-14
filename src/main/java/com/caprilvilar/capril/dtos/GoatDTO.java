package com.caprilvilar.capril.dtos;


import com.caprilvilar.capril.entities.Owner;

import java.time.LocalDate;

public class GoatDTO {

    private Long id;
    private String name;
    private String registrationNumber;
    private String breeder;
    private Owner owner;
    private String breed;
    private String coatColor;
    private String status;
    private String gender;
    private String category;
    private String tod;
    private String toe;
    private LocalDate birthDate;
    private String fatherName;
    private String fatherRegistrationNumber;
    private String motherName;
    private String motherRegistrationNumber;
    private String paternalGrandfatherName;
    private String paternalGrandfatherRegistrationNumber;
    private String paternalGrandmotherName;
    private String paternalGrandmotherRegistrationNumber;
    private String maternalGrandfatherName;
    private String maternalGrandfatherRegistrationNumber;
    private String maternalGrandmotherName;
    private String maternalGrandmotherRegistrationNumber;
    private String paternalGreatGrandfather1Name;
    private String paternalGreatGrandfather1RegistrationNumber;
    private String paternalGreatGrandmother1Name;
    private String paternalGreatGrandmother1RegistrationNumber;
    private String paternalGreatGrandfather2Name;
    private String paternalGreatGrandfather2RegistrationNumber;
    private String paternalGreatGrandmother2Name;
    private String paternalGreatGrandmother2RegistrationNumber;
    private String maternalGreatGrandfather1Name;
    private String maternalGreatGrandfather1RegistrationNumber;
    private String maternalGreatGrandmother1Name;
    private String maternalGreatGrandmother1RegistrationNumber;
    private String maternalGreatGrandfather2Name;
    private String maternalGreatGrandfather2RegistrationNumber;
    private String maternalGreatGrandmother2Name;
    private String maternalGreatGrandmother2RegistrationNumber;

    public GoatDTO() {}

    public GoatDTO(Long id, String name, String registrationNumber, String breeder, Owner owner, String breed, String coatColor, String status, String gender, String category, String tod, String toe, LocalDate birthDate, String fatherName, String fatherRegistrationNumber, String motherName, String motherRegistrationNumber, String paternalGrandfatherName, String paternalGrandfatherRegistrationNumber, String paternalGrandmotherName, String paternalGrandmotherRegistrationNumber, String maternalGrandfatherName, String maternalGrandfatherRegistrationNumber, String maternalGrandmotherName, String maternalGrandmotherRegistrationNumber, String paternalGreatGrandfather1Name, String paternalGreatGrandfather1RegistrationNumber, String paternalGreatGrandmother1Name, String paternalGreatGrandmother1RegistrationNumber, String paternalGreatGrandfather2Name, String paternalGreatGrandfather2RegistrationNumber, String paternalGreatGrandmother2Name, String paternalGreatGrandmother2RegistrationNumber, String maternalGreatGrandfather1Name, String maternalGreatGrandfather1RegistrationNumber, String maternalGreatGrandmother1Name, String maternalGreatGrandmother1RegistrationNumber, String maternalGreatGrandfather2Name, String maternalGreatGrandfather2RegistrationNumber, String maternalGreatGrandmother2Name, String maternalGreatGrandmother2RegistrationNumber) {
        this.id = id;
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.breeder = breeder;
        this.owner = owner;
        this.breed = breed;
        this.coatColor = coatColor;
        this.status = status;
        this.gender = gender;
        this.category = category;
        this.tod = tod;
        this.toe = toe;
        this.birthDate = birthDate;
        this.fatherName = fatherName;
        this.fatherRegistrationNumber = fatherRegistrationNumber;
        this.motherName = motherName;
        this.motherRegistrationNumber = motherRegistrationNumber;
        this.paternalGrandfatherName = paternalGrandfatherName;
        this.paternalGrandfatherRegistrationNumber = paternalGrandfatherRegistrationNumber;
        this.paternalGrandmotherName = paternalGrandmotherName;
        this.paternalGrandmotherRegistrationNumber = paternalGrandmotherRegistrationNumber;
        this.maternalGrandfatherName = maternalGrandfatherName;
        this.maternalGrandfatherRegistrationNumber = maternalGrandfatherRegistrationNumber;
        this.maternalGrandmotherName = maternalGrandmotherName;
        this.maternalGrandmotherRegistrationNumber = maternalGrandmotherRegistrationNumber;
        this.paternalGreatGrandfather1Name = paternalGreatGrandfather1Name;
        this.paternalGreatGrandfather1RegistrationNumber = paternalGreatGrandfather1RegistrationNumber;
        this.paternalGreatGrandmother1Name = paternalGreatGrandmother1Name;
        this.paternalGreatGrandmother1RegistrationNumber = paternalGreatGrandmother1RegistrationNumber;
        this.paternalGreatGrandfather2Name = paternalGreatGrandfather2Name;
        this.paternalGreatGrandfather2RegistrationNumber = paternalGreatGrandfather2RegistrationNumber;
        this.paternalGreatGrandmother2Name = paternalGreatGrandmother2Name;
        this.paternalGreatGrandmother2RegistrationNumber = paternalGreatGrandmother2RegistrationNumber;
        this.maternalGreatGrandfather1Name = maternalGreatGrandfather1Name;
        this.maternalGreatGrandfather1RegistrationNumber = maternalGreatGrandfather1RegistrationNumber;
        this.maternalGreatGrandmother1Name = maternalGreatGrandmother1Name;
        this.maternalGreatGrandmother1RegistrationNumber = maternalGreatGrandmother1RegistrationNumber;
        this.maternalGreatGrandfather2Name = maternalGreatGrandfather2Name;
        this.maternalGreatGrandfather2RegistrationNumber = maternalGreatGrandfather2RegistrationNumber;
        this.maternalGreatGrandmother2Name = maternalGreatGrandmother2Name;
        this.maternalGreatGrandmother2RegistrationNumber = maternalGreatGrandmother2RegistrationNumber;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getRegistrationNumber() { return registrationNumber; }
    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }
    public String getBreeder() { return breeder; }
    public void setBreeder(String breeder) { this.breeder = breeder; }
    public Owner getOwner() { return owner; }
    public void setOwner(Owner owner) { this.owner = owner; }
    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }
    public String getCoatColor() { return coatColor; }
    public void setCoatColor(String coatColor) { this.coatColor = coatColor; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
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
    public String getFatherName() { return fatherName; }
    public void setFatherName(String fatherName) { this.fatherName = fatherName; }
    public String getFatherRegistrationNumber() { return fatherRegistrationNumber; }
    public void setFatherRegistrationNumber(String fatherRegistrationNumber) { this.fatherRegistrationNumber = fatherRegistrationNumber; }
    public String getMotherName() { return motherName; }
    public void setMotherName(String motherName) { this.motherName = motherName; }
    public String getMotherRegistrationNumber() { return motherRegistrationNumber; }
    public void setMotherRegistrationNumber(String motherRegistrationNumber) { this.motherRegistrationNumber = motherRegistrationNumber; }

    public String getPaternalGrandfatherName() {
        return paternalGrandfatherName;
    }

    public void setPaternalGrandfatherName(String paternalGrandfatherName) {
        this.paternalGrandfatherName = paternalGrandfatherName;
    }

    public String getPaternalGrandfatherRegistrationNumber() {
        return paternalGrandfatherRegistrationNumber;
    }

    public void setPaternalGrandfatherRegistrationNumber(String paternalGrandfatherRegistrationNumber) {
        this.paternalGrandfatherRegistrationNumber = paternalGrandfatherRegistrationNumber;
    }

    public String getPaternalGrandmotherName() {
        return paternalGrandmotherName;
    }

    public void setPaternalGrandmotherName(String paternalGrandmotherName) {
        this.paternalGrandmotherName = paternalGrandmotherName;
    }

    public String getPaternalGrandmotherRegistrationNumber() {
        return paternalGrandmotherRegistrationNumber;
    }

    public void setPaternalGrandmotherRegistrationNumber(String paternalGrandmotherRegistrationNumber) {
        this.paternalGrandmotherRegistrationNumber = paternalGrandmotherRegistrationNumber;
    }

    public String getMaternalGrandfatherName() {
        return maternalGrandfatherName;
    }

    public void setMaternalGrandfatherName(String maternalGrandfatherName) {
        this.maternalGrandfatherName = maternalGrandfatherName;
    }

    public String getMaternalGrandfatherRegistrationNumber() {
        return maternalGrandfatherRegistrationNumber;
    }

    public void setMaternalGrandfatherRegistrationNumber(String maternalGrandfatherRegistrationNumber) {
        this.maternalGrandfatherRegistrationNumber = maternalGrandfatherRegistrationNumber;
    }

    public String getMaternalGrandmotherName() {
        return maternalGrandmotherName;
    }

    public void setMaternalGrandmotherName(String maternalGrandmotherName) {
        this.maternalGrandmotherName = maternalGrandmotherName;
    }

    public String getMaternalGrandmotherRegistrationNumber() {
        return maternalGrandmotherRegistrationNumber;
    }

    public void setMaternalGrandmotherRegistrationNumber(String maternalGrandmotherRegistrationNumber) {
        this.maternalGrandmotherRegistrationNumber = maternalGrandmotherRegistrationNumber;
    }

    public String getPaternalGreatGrandfather1Name() {
        return paternalGreatGrandfather1Name;
    }

    public void setPaternalGreatGrandfather1Name(String paternalGreatGrandfather1Name) {
        this.paternalGreatGrandfather1Name = paternalGreatGrandfather1Name;
    }

    public String getPaternalGreatGrandfather1RegistrationNumber() {
        return paternalGreatGrandfather1RegistrationNumber;
    }

    public void setPaternalGreatGrandfather1RegistrationNumber(String paternalGreatGrandfather1RegistrationNumber) {
        this.paternalGreatGrandfather1RegistrationNumber = paternalGreatGrandfather1RegistrationNumber;
    }

    public String getPaternalGreatGrandmother1Name() {
        return paternalGreatGrandmother1Name;
    }

    public void setPaternalGreatGrandmother1Name(String paternalGreatGrandmother1Name) {
        this.paternalGreatGrandmother1Name = paternalGreatGrandmother1Name;
    }

    public String getPaternalGreatGrandmother1RegistrationNumber() {
        return paternalGreatGrandmother1RegistrationNumber;
    }

    public void setPaternalGreatGrandmother1RegistrationNumber(String paternalGreatGrandmother1RegistrationNumber) {
        this.paternalGreatGrandmother1RegistrationNumber = paternalGreatGrandmother1RegistrationNumber;
    }

    public String getPaternalGreatGrandfather2Name() {
        return paternalGreatGrandfather2Name;
    }

    public void setPaternalGreatGrandfather2Name(String paternalGreatGrandfather2Name) {
        this.paternalGreatGrandfather2Name = paternalGreatGrandfather2Name;
    }

    public String getPaternalGreatGrandfather2RegistrationNumber() {
        return paternalGreatGrandfather2RegistrationNumber;
    }

    public void setPaternalGreatGrandfather2RegistrationNumber(String paternalGreatGrandfather2RegistrationNumber) {
        this.paternalGreatGrandfather2RegistrationNumber = paternalGreatGrandfather2RegistrationNumber;
    }

    public String getPaternalGreatGrandmother2Name() {
        return paternalGreatGrandmother2Name;
    }

    public void setPaternalGreatGrandmother2Name(String paternalGreatGrandmother2Name) {
        this.paternalGreatGrandmother2Name = paternalGreatGrandmother2Name;
    }

    public String getPaternalGreatGrandmother2RegistrationNumber() {
        return paternalGreatGrandmother2RegistrationNumber;
    }

    public void setPaternalGreatGrandmother2RegistrationNumber(String paternalGreatGrandmother2RegistrationNumber) {
        this.paternalGreatGrandmother2RegistrationNumber = paternalGreatGrandmother2RegistrationNumber;
    }

    public String getMaternalGreatGrandfather1Name() {
        return maternalGreatGrandfather1Name;
    }

    public void setMaternalGreatGrandfather1Name(String maternalGreatGrandfather1Name) {
        this.maternalGreatGrandfather1Name = maternalGreatGrandfather1Name;
    }

    public String getMaternalGreatGrandfather1RegistrationNumber() {
        return maternalGreatGrandfather1RegistrationNumber;
    }

    public void setMaternalGreatGrandfather1RegistrationNumber(String maternalGreatGrandfather1RegistrationNumber) {
        this.maternalGreatGrandfather1RegistrationNumber = maternalGreatGrandfather1RegistrationNumber;
    }

    public String getMaternalGreatGrandmother1Name() {
        return maternalGreatGrandmother1Name;
    }

    public void setMaternalGreatGrandmother1Name(String maternalGreatGrandmother1Name) {
        this.maternalGreatGrandmother1Name = maternalGreatGrandmother1Name;
    }

    public String getMaternalGreatGrandmother1RegistrationNumber() {
        return maternalGreatGrandmother1RegistrationNumber;
    }

    public void setMaternalGreatGrandmother1RegistrationNumber(String maternalGreatGrandmother1RegistrationNumber) {
        this.maternalGreatGrandmother1RegistrationNumber = maternalGreatGrandmother1RegistrationNumber;
    }

    public String getMaternalGreatGrandfather2Name() {
        return maternalGreatGrandfather2Name;
    }

    public void setMaternalGreatGrandfather2Name(String maternalGreatGrandfather2Name) {
        this.maternalGreatGrandfather2Name = maternalGreatGrandfather2Name;
    }

    public String getMaternalGreatGrandfather2RegistrationNumber() {
        return maternalGreatGrandfather2RegistrationNumber;
    }

    public void setMaternalGreatGrandfather2RegistrationNumber(String maternalGreatGrandfather2RegistrationNumber) {
        this.maternalGreatGrandfather2RegistrationNumber = maternalGreatGrandfather2RegistrationNumber;
    }

    public String getMaternalGreatGrandmother2Name() {
        return maternalGreatGrandmother2Name;
    }

    public void setMaternalGreatGrandmother2Name(String maternalGreatGrandmother2Name) {
        this.maternalGreatGrandmother2Name = maternalGreatGrandmother2Name;
    }

    public String getMaternalGreatGrandmother2RegistrationNumber() {
        return maternalGreatGrandmother2RegistrationNumber;
    }

    public void setMaternalGreatGrandmother2RegistrationNumber(String maternalGreatGrandmother2RegistrationNumber) {
        this.maternalGreatGrandmother2RegistrationNumber = maternalGreatGrandmother2RegistrationNumber;
    }
}
