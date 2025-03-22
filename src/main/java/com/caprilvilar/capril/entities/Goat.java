package com.caprilvilar.capril.entities;

import com.caprilvilar.capril.dtos.GoatDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "goats")
public class Goat {

    @Id
    @Column(name = "registration_number", nullable = false, unique = true)
    private String registrationNumber; // PK baseada no número de registro

    private String name;
    private String breed;

    @Column(name = "goat_color")
    private String color;

    @Enumerated(EnumType.STRING)
    private GoatStatus status;

    private String gender;
    private String category;
    private String tod;
    private String toe;
    private LocalDate birthDate;

    @ManyToOne
    @JoinColumn(name = "father_id", referencedColumnName = "registration_number")
    @JsonIgnore
    private Goat father;

    @ManyToOne
    @JoinColumn(name = "mother_id", referencedColumnName = "registration_number")
    @JsonIgnore
    private Goat mother;

    // Goat.java
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "goat_farm_id")
    private GoatFarm goatFarm;

    @Column(name = "active")
    private boolean active; // Adicionando o campo 'ativo'


    public Goat() {
        this.active = true; // Valor padrão para 'ativo'
    }


    public Goat(String registrationNumber, String name, String breed, String color, GoatStatus status,
                String gender, String category, String tod, String toe, LocalDate birthDate, Goat father, Goat mother,
                GoatFarm goatFarm) {
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
        this.father = father;
        this.mother = mother;
        this.goatFarm = goatFarm;
        this.active = true;
    }

    //  Getters e Setters
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

    public Goat getFather() {
        return father;
    }

    public void setFather(Goat father) {
        this.father = father;
    }

    public Goat getMother() {
        return mother;
    }

    public void setMother(Goat mother) {
        this.mother = mother;
    }

    public GoatFarm getGoatFarm() {
        return goatFarm;
    }

    public void setGoatFarm(GoatFarm goatFarm) {
        this.goatFarm = goatFarm;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}