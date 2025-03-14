package com.caprilvilar.capril.mapper;

import com.caprilvilar.capril.dtos.GoatDTO;
import com.caprilvilar.capril.entities.Goat;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class GoatMapper {

    public static GoatDTO toDTO(Goat goat) {
        return Optional.ofNullable(goat).map(g -> {
            GoatDTO dto = new GoatDTO();
            dto.setId(g.getId());
            dto.setName(g.getName());
            dto.setRegistrationNumber(g.getRegistrationNumber());
            dto.setBreeder(g.getBreeder());
            dto.setOwner(g.getOwner());
            dto.setBreed(g.getBreed());
            dto.setCoatColor(g.getCoatColor());
            dto.setStatus(g.getStatus());
            dto.setGender(g.getGender());
            dto.setCategory(g.getCategory());
            dto.setTod(g.getTod());
            dto.setToe(g.getToe());
            dto.setBirthDate(g.getBirthDate());

            // Parentesco
            dto.setFatherName(g.getFatherName());
            dto.setFatherRegistrationNumber(g.getFatherRegistrationNumber());
            dto.setMotherName(g.getMotherName());
            dto.setMotherRegistrationNumber(g.getMotherRegistrationNumber());

            dto.setPaternalGrandfatherName(g.getPaternalGrandfatherName());
            dto.setPaternalGrandfatherRegistrationNumber(g.getPaternalGrandfatherRegistrationNumber());
            dto.setPaternalGrandmotherName(g.getPaternalGrandmotherName());
            dto.setPaternalGrandmotherRegistrationNumber(g.getPaternalGrandmotherRegistrationNumber());

            dto.setMaternalGrandfatherName(g.getMaternalGrandfatherName());
            dto.setMaternalGrandfatherRegistrationNumber(g.getMaternalGrandfatherRegistrationNumber());
            dto.setMaternalGrandmotherName(g.getMaternalGrandmotherName());
            dto.setMaternalGrandmotherRegistrationNumber(g.getMaternalGrandmotherRegistrationNumber());

            dto.setPaternalGreatGrandfather1Name(g.getPaternalGreatGrandfather1Name());
            dto.setPaternalGreatGrandfather1RegistrationNumber(g.getPaternalGreatGrandfather1RegistrationNumber());
            dto.setPaternalGreatGrandmother1Name(g.getPaternalGreatGrandmother1Name());
            dto.setPaternalGreatGrandmother1RegistrationNumber(g.getPaternalGreatGrandmother1RegistrationNumber());

            dto.setPaternalGreatGrandfather2Name(g.getPaternalGreatGrandfather2Name());
            dto.setPaternalGreatGrandfather2RegistrationNumber(g.getPaternalGreatGrandfather2RegistrationNumber());
            dto.setPaternalGreatGrandmother2Name(g.getPaternalGreatGrandmother2Name());
            dto.setPaternalGreatGrandmother2RegistrationNumber(g.getPaternalGreatGrandmother2RegistrationNumber());

            dto.setMaternalGreatGrandfather1Name(g.getMaternalGreatGrandfather1Name());
            dto.setMaternalGreatGrandfather1RegistrationNumber(g.getMaternalGreatGrandfather1RegistrationNumber());
            dto.setMaternalGreatGrandmother1Name(g.getMaternalGreatGrandmother1Name());
            dto.setMaternalGreatGrandmother1RegistrationNumber(g.getMaternalGreatGrandmother1RegistrationNumber());

            dto.setMaternalGreatGrandfather2Name(g.getMaternalGreatGrandfather2Name());
            dto.setMaternalGreatGrandfather2RegistrationNumber(g.getMaternalGreatGrandfather2RegistrationNumber());
            dto.setMaternalGreatGrandmother2Name(g.getMaternalGreatGrandmother2Name());
            dto.setMaternalGreatGrandmother2RegistrationNumber(g.getMaternalGreatGrandmother2RegistrationNumber());

            return dto;
        }).orElse(null);
    }

    public static Goat toEntity(GoatDTO dto) {
        if (dto == null) {
            return null;
        }

        Goat goat = new Goat();
        goat.setId(dto.getId());
        goat.setName(dto.getName());
        goat.setRegistrationNumber(dto.getRegistrationNumber());
        goat.setBreeder(dto.getBreeder());
        goat.setOwner(dto.getOwner());
        goat.setBreed(dto.getBreed());
        goat.setCoatColor(dto.getCoatColor());
        goat.setStatus(dto.getStatus());
        goat.setGender(dto.getGender());
        goat.setCategory(dto.getCategory());
        goat.setTod(dto.getTod());
        goat.setToe(dto.getToe());
        goat.setBirthDate(dto.getBirthDate());

        // Parentesco
        goat.setFatherName(dto.getFatherName());
        goat.setFatherRegistrationNumber(dto.getFatherRegistrationNumber());
        goat.setMotherName(dto.getMotherName());
        goat.setMotherRegistrationNumber(dto.getMotherRegistrationNumber());

        goat.setPaternalGrandfatherName(dto.getPaternalGrandfatherName());
        goat.setPaternalGrandfatherRegistrationNumber(dto.getPaternalGrandfatherRegistrationNumber());
        goat.setPaternalGrandmotherName(dto.getPaternalGrandmotherName());
        goat.setPaternalGrandmotherRegistrationNumber(dto.getPaternalGrandmotherRegistrationNumber());

        goat.setMaternalGrandfatherName(dto.getMaternalGrandfatherName());
        goat.setMaternalGrandfatherRegistrationNumber(dto.getMaternalGrandfatherRegistrationNumber());
        goat.setMaternalGrandmotherName(dto.getMaternalGrandmotherName());
        goat.setMaternalGrandmotherRegistrationNumber(dto.getMaternalGrandmotherRegistrationNumber());

        goat.setPaternalGreatGrandfather1Name(dto.getPaternalGreatGrandfather1Name());
        goat.setPaternalGreatGrandfather1RegistrationNumber(dto.getPaternalGreatGrandfather1RegistrationNumber());
        goat.setPaternalGreatGrandmother1Name(dto.getPaternalGreatGrandmother1Name());
        goat.setPaternalGreatGrandmother1RegistrationNumber(dto.getPaternalGreatGrandmother1RegistrationNumber());

        goat.setPaternalGreatGrandfather2Name(dto.getPaternalGreatGrandfather2Name());
        goat.setPaternalGreatGrandfather2RegistrationNumber(dto.getPaternalGreatGrandfather2RegistrationNumber());
        goat.setPaternalGreatGrandmother2Name(dto.getPaternalGreatGrandmother2Name());
        goat.setPaternalGreatGrandmother2RegistrationNumber(dto.getPaternalGreatGrandmother2RegistrationNumber());

        goat.setMaternalGreatGrandfather1Name(dto.getMaternalGreatGrandfather1Name());
        goat.setMaternalGreatGrandfather1RegistrationNumber(dto.getMaternalGreatGrandfather1RegistrationNumber());
        goat.setMaternalGreatGrandmother1Name(dto.getMaternalGreatGrandmother1Name());
        goat.setMaternalGreatGrandmother1RegistrationNumber(dto.getMaternalGreatGrandmother1RegistrationNumber());

        goat.setMaternalGreatGrandfather2Name(dto.getMaternalGreatGrandfather2Name());
        goat.setMaternalGreatGrandfather2RegistrationNumber(dto.getMaternalGreatGrandfather2RegistrationNumber());
        goat.setMaternalGreatGrandmother2Name(dto.getMaternalGreatGrandmother2Name());
        goat.setMaternalGreatGrandmother2RegistrationNumber(dto.getMaternalGreatGrandmother2RegistrationNumber());

        return goat;
    }

    // Métodos para converter listas

    public static List<GoatDTO> toDTOList(List<Goat> goats) {
        return goats.stream().map(GoatMapper::toDTO).collect(Collectors.toList());
    }

    public static List<Goat> toEntityList(List<GoatDTO> dtos) {
        return dtos.stream().map(GoatMapper::toEntity).collect(Collectors.toList());
    }
}

