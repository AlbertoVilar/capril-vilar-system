package com.caprilvilar.capril.entities;

import com.caprilvilar.capril.GoatFarm;
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
    private String breeder;
    private String ownerName;
    private String breed;

    @Column(name = "goat_color")
    private String color;

    @Enumerated(EnumType.STRING) // Adicionado para o Enum GoatStatus
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

    @ManyToOne
    @JoinColumn(name = "goat_farm_id")
    private GoatFarm goatFarm;

    @Column(name = "active")
    private boolean active; // Adicionando o campo 'ativo'


    public Goat() {
        this.active = true; // Valor padrão para 'ativo'
    }


    public Goat(String registrationNumber, String name, String breeder, String ownerName,
                String breed, String color, GoatStatus status, String gender, String category,
                String tod, String toe, LocalDate birthDate, Goat father, Goat mother, GoatFarm goatFarm) {
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
        this.mother = mother;
        this.goatFarm = goatFarm;
        this.active = true;
    }

    public Goat(GoatDTO dto) {
        this.registrationNumber = dto.getRegistrationNumber();
        this.name = dto.getName();
        this.breeder = dto.getBreeder();
        this.ownerName = dto.getOwnerName();
        this.breed = dto.getBreed();
        this.color = dto.getColor();
        this.status = GoatStatus.valueOf(dto.getStatus().name());
        this.gender = dto.getGender();
        this.category = dto.getCategory();
        this.tod = dto.getTod();
        this.toe = dto.getToe();
        this.birthDate = dto.getBirthDate();
        this.active = true;

        // Correção: Usar registrationNumberFather e registrationNumberMother
        if (dto.getRegistrationNumberFather() != null) {
            Goat father = new Goat();
            father.setRegistrationNumber(dto.getRegistrationNumberFather());
            this.father = father;
        }
        if (dto.getRegistrationNumberMother() != null) {
            Goat mother = new Goat();
            mother.setRegistrationNumber(dto.getRegistrationNumberMother());
            this.mother = mother;
        }

        //Definir goatFarm
        this.goatFarm = null; //Ou defina o goatFarm aqui.
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