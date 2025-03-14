package com.caprilvilar.capril.entities;

import com.caprilvilar.capril.GoatFarm;
import com.caprilvilar.capril.entities.Owner;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "goats")
public class Goat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "registro")
    private String registrationNumber;

    @Column(name = "criador")
    private String breeder;

    @ManyToOne
    @JoinColumn(name = "proprietario_id", referencedColumnName = "id")
    private Owner owner;

    @Column(name = "raca")
    private String breed;

    @Column(name = "pelagem")
    private String coatColor;

    @Column(name = "situacao")
    private String status;

    @Column(name = "sexo")
    private String gender;

    @Column(name = "categoria")
    private String category;

    @Column(name = "tod")
    private String tod;

    @Column(name = "toe")
    private String toe;

    @Column(name = "data_nascimento")
    private LocalDate birthDate;

    @Column(name = "pai_nome")
    private String fatherName;

    @Column(name = "pai_registro")
    private String fatherRegistrationNumber;

    @Column(name = "mae_nome")
    private String motherName;

    @Column(name = "mae_registro")
    private String motherRegistrationNumber;

    @Column(name = "avo_paterno_nome")
    private String paternalGrandfatherName;

    @Column(name = "avo_paterno_registro")
    private String paternalGrandfatherRegistrationNumber;

    @Column(name = "avo_paterna_nome")
    private String paternalGrandmotherName;

    @Column(name = "avo_paterna_registro")
    private String paternalGrandmotherRegistrationNumber;

    @Column(name = "avo_materno_nome")
    private String maternalGrandfatherName;

    @Column(name = "avo_materno_registro")
    private String maternalGrandfatherRegistrationNumber;

    @Column(name = "avo_materna_nome")
    private String maternalGrandmotherName;

    @Column(name = "avo_materna_registro")
    private String maternalGrandmotherRegistrationNumber;

    @Column(name = "bisavo_paterno1_nome")
    private String paternalGreatGrandfather1Name;

    @Column(name = "bisavo_paterno1_registro")
    private String paternalGreatGrandfather1RegistrationNumber;

    @Column(name = "bisavo_paterna1_nome")
    private String paternalGreatGrandmother1Name;

    @Column(name = "bisavo_paterna1_registro")
    private String paternalGreatGrandmother1RegistrationNumber;

    @Column(name = "bisavo_paterno2_nome")
    private String paternalGreatGrandfather2Name;

    @Column(name = "bisavo_paterno2_registro")
    private String paternalGreatGrandfather2RegistrationNumber;

    @Column(name = "bisavo_paterna2_nome")
    private String paternalGreatGrandmother2Name;

    @Column(name = "bisavo_paterna2_registro")
    private String paternalGreatGrandmother2RegistrationNumber;

    @Column(name = "bisavo_materno1_nome")
    private String maternalGreatGrandfather1Name;

    @Column(name = "bisavo_materno1_registro")
    private String maternalGreatGrandfather1RegistrationNumber;

    @Column(name = "bisavo_materna1_nome")
    private String maternalGreatGrandmother1Name;

    @Column(name = "bisavo_materna1_registro")
    private String maternalGreatGrandmother1RegistrationNumber;

    @Column(name = "bisavo_materno2_nome")
    private String maternalGreatGrandfather2Name;

    @Column(name = "bisavo_materno2_registro")
    private String maternalGreatGrandfather2RegistrationNumber;

    @Column(name = "bisavo_materna2_nome")
    private String maternalGreatGrandmother2Name;

    @Column(name = "bisavo_materna2_registro")
    private String maternalGreatGrandmother2RegistrationNumber;

    @ManyToOne
    @JoinColumn(name = "goat_farm_id") // Certifique-se de que esta coluna existe no banco
    private GoatFarm goatFarm;


    public Goat() {
    }

    public Goat(Long id, String name, String registrationNumber, String breeder, Owner owner,
                String breed, String coatColor, String status, String gender, String category, String tod, String toe,
                LocalDate birthDate, String fatherName, String fatherRegistrationNumber, String motherName, String motherRegistrationNumber,
                String paternalGrandfatherName, String paternalGrandfatherRegistrationNumber, String paternalGrandmotherName,
                String paternalGrandmotherRegistrationNumber, String maternalGrandfatherName, String maternalGrandfatherRegistrationNumber,
                String maternalGrandmotherName, String maternalGrandmotherRegistrationNumber, String paternalGreatGrandfather1Name,
                String paternalGreatGrandfather1RegistrationNumber, String paternalGreatGrandmother1Name,
                String paternalGreatGrandmother1RegistrationNumber, String paternalGreatGrandfather2Name,
                String paternalGreatGrandfather2RegistrationNumber, String paternalGreatGrandmother2Name,
                String paternalGreatGrandmother2RegistrationNumber, String maternalGreatGrandfather1Name,
                String maternalGreatGrandfather1RegistrationNumber, String maternalGreatGrandmother1Name,
                String maternalGreatGrandmother1RegistrationNumber, String maternalGreatGrandfather2Name,
                String maternalGreatGrandfather2RegistrationNumber, String maternalGreatGrandmother2Name,
                String maternalGreatGrandmother2RegistrationNumber, GoatFarm goatFarm) {

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
        this.goatFarm = goatFarm;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getBreeder() {
        return breeder;
    }

    public void setBreeder(String breeder) {
        this.breeder = breeder;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
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

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherRegistrationNumber() {
        return fatherRegistrationNumber;
    }

    public void setFatherRegistrationNumber(String fatherRegistrationNumber) {
        this.fatherRegistrationNumber = fatherRegistrationNumber;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMotherRegistrationNumber() {
        return motherRegistrationNumber;
    }

    public void setMotherRegistrationNumber(String motherRegistrationNumber) {
        this.motherRegistrationNumber = motherRegistrationNumber;
    }

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
