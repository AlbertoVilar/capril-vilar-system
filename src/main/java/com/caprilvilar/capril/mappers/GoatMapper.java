package com.caprilvilar.capril.mappers;

import com.caprilvilar.capril.dtos.GoatDTO;
import com.caprilvilar.capril.dtos.GoatFarmDTO;
import com.caprilvilar.capril.dtos.GoatGenealogyDTO;
import com.caprilvilar.capril.entities.Goat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GoatMapper {

    private final GoatFarmMapper goatFarmMapper;

    @Autowired
    public GoatMapper(GoatFarmMapper goatFarmMapper) {
        this.goatFarmMapper = goatFarmMapper;
    }

    public GoatGenealogyDTO toGoatGenealogyDTO(GoatDTO goatDTO) {
        GoatGenealogyDTO goatGenealogyDTO = new GoatGenealogyDTO();
        // Mapeamento de campos básicos
        goatGenealogyDTO.setName(goatDTO.getName());
        goatGenealogyDTO.setRegistrationNumber(goatDTO.getRegistrationNumber());
        goatGenealogyDTO.setBreed(goatDTO.getBreed());
        goatGenealogyDTO.setColor(goatDTO.getColor());
        goatGenealogyDTO.setStatus(goatDTO.getStatus() != null ? goatDTO.getStatus().toString() : null);
        goatGenealogyDTO.setGender(goatDTO.getGender());
        goatGenealogyDTO.setCategory(goatDTO.getCategory());
        goatGenealogyDTO.setTod(goatDTO.getTod());
        goatGenealogyDTO.setToe(goatDTO.getToe());
        goatGenealogyDTO.setBirthDate(goatDTO.getBirthDate());

        return goatGenealogyDTO;
    }

    public Goat toGoat(GoatDTO goatDTO) {
        if (goatDTO == null) {
            return null;
        }
        Goat goat = new Goat();
        goat.setRegistrationNumber(goatDTO.getRegistrationNumber());
        goat.setName(goatDTO.getName());
        goat.setBreed(goatDTO.getBreed());
        goat.setColor(goatDTO.getColor());
        goat.setStatus(goatDTO.getStatus());
        goat.setGender(goatDTO.getGender());
        goat.setCategory(goatDTO.getCategory());
        goat.setTod(goatDTO.getTod());
        goat.setToe(goatDTO.getToe());
        goat.setBirthDate(goatDTO.getBirthDate());
        goat.setActive(goatDTO.isActive());
        // Mapeamento de outros campos
        // ...
        return goat;
    }

    public GoatDTO toDTO(Goat goat) {
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
}