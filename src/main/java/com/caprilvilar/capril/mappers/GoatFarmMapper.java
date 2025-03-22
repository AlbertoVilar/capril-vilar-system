package com.caprilvilar.capril.mappers;

import com.caprilvilar.capril.dtos.GoatDTO;
import com.caprilvilar.capril.dtos.GoatFarmDTO;
import com.caprilvilar.capril.entities.Goat;
import com.caprilvilar.capril.entities.GoatFarm;
import com.caprilvilar.capril.entities.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class GoatFarmMapper {

    private final GoatSimpleMapper goatMapper;

    @Autowired
    public GoatFarmMapper(GoatSimpleMapper goatMapper) {
        this.goatMapper = goatMapper;
    }

    public GoatFarmDTO toDTO(GoatFarm goatFarm) {
        if (goatFarm == null) {
            return null;
        }

        GoatFarmDTO dto = new GoatFarmDTO();
        dto.setId(goatFarm.getId());
        dto.setName(goatFarm.getName());
        dto.setAddress(goatFarm.getAddress());
        dto.setPhoneNumber(formatPhoneNumbers(goatFarm.getPhones()));
        dto.setOwnerName(goatFarm.getOwner().getName());

        List<GoatDTO> goats = goatFarm.getGoats().stream()
                .map(goatMapper::toDTO)
                .collect(Collectors.toList());
        dto.setGoats(goats);

        return dto;
    }

    public GoatFarm toEntity(GoatFarmDTO dto) {
        if (dto == null) {
            return null;
        }

        GoatFarm goatFarm = new GoatFarm();
        goatFarm.setId(dto.getId());
        goatFarm.setName(dto.getName());
        goatFarm.setAddress(dto.getAddress());

        if (dto.getGoats() != null) {
            Set<Goat> goats = dto.getGoats().stream()
                    .map(goatMapper::toEntity)
                    .collect(Collectors.toSet()); // Converter para Set aqui
            goatFarm.setGoats(goats);
        }

        return goatFarm;
    }

    private String formatPhoneNumbers(List<Phone> phones) {
        if (phones == null || phones.isEmpty()) {
            return null;
        }
        return phones.stream()
                .map(Phone::getNumber)
                .collect(Collectors.joining(", "));
    }

    @Component
    public static class GoatGenealogyMapper {

        public void mapGenealogy(GoatDTO goatDTO, Goat goat) {
            // Dados Básicos da Cabra
            goatDTO.setRegistrationNumber(goat.getRegistrationNumber());
            goatDTO.setName(goat.getName());
            goatDTO.setBreed(goat.getBreed());
            goatDTO.setColor(goat.getColor());
            goatDTO.setStatus(goat.getStatus());
            goatDTO.setGender(goat.getGender());
            goatDTO.setCategory(goat.getCategory());
            goatDTO.setTod(goat.getTod());
            goatDTO.setToe(goat.getToe());
            goatDTO.setBirthDate(goat.getBirthDate());
            goatDTO.setActive(goat.isActive());



            /* Pais
            goatDTO.setName(goat.getFather() != null ? goat.getFather().getName() : null);
            goatDTO.setFatherRegistrationNumber(goat.getFather() != null ? goat.getFather().getRegistrationNumber() : null);
            goatDTO.setMotherName(goat.getMother() != null ? goat.getMother().getName() : null);
            goatDTO.setMotherRegistrationNumber(goat.getMother() != null ? goat.getMother().getRegistrationNumber() : null);

            // Avós Paternos
            goatDTO.setPaternalGrandfatherName(goat.getFather() != null && goat.getFather().getFather() != null ? goat.getFather().getFather().getName() : null);
            goatDTO.setPaternalGrandfatherRegistrationNumber(goat.getFather() != null && goat.getFather().getFather() != null ? goat.getFather().getFather().getRegistrationNumber() : null);
            goatDTO.setPaternalGrandmotherName(goat.getFather() != null && goat.getFather().getMother() != null ? goat.getFather().getMother().getName() : null);
            goatDTO.setPaternalGrandmotherRegistrationNumber(goat.getFather() != null && goat.getFather().getMother() != null ? goat.getFather().getMother().getRegistrationNumber() : null);

            // Avós Maternos
            goatDTO.setMaternalGrandfatherName(goat.getMother() != null && goat.getMother().getFather() != null ? goat.getMother().getMother().getName() : null);
            goatDTO.setMaternalGrandfatherRegistrationNumber(goat.getMother() != null && goat.getMother().getFather() != null ? goat.getMother().getFather().getRegistrationNumber() : null);
            goatDTO.setMaternalGrandmotherName(goat.getMother() != null && goat.getMother().getMother() != null ? goat.getMother().getMother().getName() : null);
            goatDTO.setMaternalGrandmotherRegistrationNumber(goat.getMother() != null && goat.getMother().getMother() != null ? goat.getMother().getMother().getRegistrationNumber() : null);

            // Bisavós Paternos
            goatDTO.setPaternalGreatGrandfatherName(goat.getFather() != null && goat.getFather().getFather() != null && goat.getFather().getFather().getFather() != null ? goat.getFather().getFather().getFather().getName() : null);
            goatDTO.setPaternalGreatGrandfatherRegistrationNumber(goat.getFather() != null && goat.getFather().getFather() != null && goat.getFather().getFather().getFather() != null ? goat.getFather().getFather().getFather().getRegistrationNumber() : null);
            goatDTO.setPaternalGreatGrandmotherName(goat.getFather() != null && goat.getFather().getFather() != null && goat.getFather().getFather().getMother() != null ? goat.getFather().getFather().getMother().getName() : null);
            goatDTO.setPaternalGreatGrandmotherRegistrationNumber(goat.getFather() != null && goat.getFather().getFather() != null && goat.getFather().getFather().getMother() != null ? goat.getFather().getFather().getMother().getRegistrationNumber() : null);

            // Bisavós Maternos
            goatDTO.setMaternalGreatGrandfatherName(goat.getMother() != null && goat.getMother().getMother() != null && goat.getMother().getMother().getFather() != null ? goat.getMother().getMother().getFather().getName() : null);
            goatDTO.setMaternalGreatGrandfatherRegistrationNumber(goat.getMother() != null && goat.getMother().getMother() != null && goat.getMother().getMother().getFather() != null ? goat.getMother().getMother().getFather().getRegistrationNumber() : null);
            goatDTO.setMaternalGreatGrandmotherName(goat.getMother() != null && goat.getMother().getMother() != null && goat.getMother().getMother().getMother() != null ? goat.getMother().getMother().getMother().getName() : null);
            goatDTO.setMaternalGreatGrandmotherRegistrationNumber(goat.getMother() != null && goat.getMother().getMother() != null && goat.getMother().getMother().getMother() != null ? goat.getMother().getMother().getMother().getRegistrationNumber() : null);
         */
        }
    }
}




