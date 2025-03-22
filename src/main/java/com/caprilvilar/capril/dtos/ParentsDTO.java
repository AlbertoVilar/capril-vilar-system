package com.caprilvilar.capril.dtos;

public class ParentsDTO {
    private String fatherName;
    private String fatherRegistrationNumber;
    private String motherName;
    private String motherRegistrationNumber;

    public ParentsDTO() {
    }

    public ParentsDTO(String fatherName, String fatherRegistrationNumber, String motherName, String motherRegistrationNumber) {
        this.fatherName = fatherName;
        this.fatherRegistrationNumber = fatherRegistrationNumber;
        this.motherName = motherName;
        this.motherRegistrationNumber = motherRegistrationNumber;
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
}
