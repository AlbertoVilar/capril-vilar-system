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

        // Converte Set<Goat> para List<GoatDTO>
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
            // Converte List<GoatDTO> para Set<Goat>
            Set<Goat> goats = dto.getGoats().stream()
                    .map(goatMapper::toEntity)
                    .collect(Collectors.toSet());
            goatFarm.setGoats(goats);
        }

        return goatFarm;
    }

    private String formatPhoneNumbers(Set<Phone> phones) {
        if (phones == null || phones.isEmpty()) {
            return null;
        }
        return phones.stream()
                .map(Phone::getNumber)
                .collect(Collectors.joining(", "));
    }
}