package com.caprilvilar.capril.mappers;

import com.caprilvilar.capril.dtos.GoatDTO;
import com.caprilvilar.capril.entities.Goat;
import org.springframework.stereotype.Component;

@Component
public class GoatSimpleMapper {

    public GoatDTO toDTO(Goat goat) {
        if (goat == null) {
            return null;
        }

        GoatDTO dto = new GoatDTO();
        dto.setRegistrationNumber(goat.getRegistrationNumber());
        dto.setName(goat.getName());
        dto.setBreed(goat.getBreed());
        dto.setColor(goat.getColor());
        dto.setStatus(goat.getStatus());
        dto.setGender(goat.getGender());
        dto.setCategory(goat.getCategory());
        dto.setTod(goat.getTod());
        dto.setToe(goat.getToe());
        dto.setBirthDate(goat.getBirthDate());
        dto.setActive(goat.isActive());


        return dto;
    }

    public Goat toEntity(GoatDTO dto) {
        if (dto == null) {
            return null;
        }

        Goat goat = new Goat();
        goat.setRegistrationNumber(dto.getRegistrationNumber());
        goat.setName(dto.getName());
        goat.setBreed(dto.getBreed());
        goat.setColor(dto.getColor());
        goat.setStatus(dto.getStatus());
        goat.setGender(dto.getGender());
        goat.setCategory(dto.getCategory());
        goat.setTod(dto.getTod());
        goat.setToe(dto.getToe());
        goat.setBirthDate(dto.getBirthDate());
        goat.setActive(dto.isActive());

        return goat;
    }
}