package com.caprilvilar.capril.mappers;

import com.caprilvilar.capril.dtos.GoatDTO;
import com.caprilvilar.capril.dtos.GoatFarmDTO;
import com.caprilvilar.capril.entities.Goat;
import com.caprilvilar.capril.entities.GoatFarm;
import com.caprilvilar.capril.entities.GoatStatus;
import com.caprilvilar.capril.repositories.GoatFarmRepository;
import com.caprilvilar.capril.repositories.GoatRepository;
import org.springframework.stereotype.Component;

@Component
public class GoatMapper {

    public Goat toEntity(GoatDTO dto, GoatRepository goatRepository, GoatFarmRepository goatFarmRepository) {

        Goat goat = new Goat();

        goat.setRegistrationNumber(dto.getRegistrationNumber());
        goat.setName(dto.getName());
        goat.setBreeder(dto.getBreeder());
        goat.setOwnerName(dto.getOwnerName());
        goat.setBreed(dto.getBreed());
        goat.setColor(dto.getColor());
        goat.setStatus(GoatStatus.valueOf(dto.getStatus().name()));
        goat.setGender(dto.getGender());
        goat.setCategory(dto.getCategory());
        goat.setTod(dto.getTod());
        goat.setToe(dto.getToe());
        goat.setBirthDate(dto.getBirthDate());
        goat.setActive(true);

        if (dto.getRegistrationNumberFather() != null) {
            Goat father = goatRepository.findByRegistrationNumber(dto.getRegistrationNumberFather());
            goat.setFather(father);
        }

        if (dto.getRegistrationNumberMother() != null) {
            Goat mother = goatRepository.findByRegistrationNumber(dto.getRegistrationNumberMother());
            goat.setMother(mother);
        }

        if (dto.getGoatFarm() != null && dto.getGoatFarm().getId() != null) {
            GoatFarm goatFarm;
            goatFarm = goatFarmRepository.findGoatFarmById(dto.getGoatFarm().getId());
            goat.setGoatFarm(goatFarm);
        }

        return goat;
    }

    public GoatDTO toDTO(Goat goat) {
        if (goat == null) {
            return null;
        }

        GoatDTO dto = new GoatDTO();
        dto.setRegistrationNumber(goat.getRegistrationNumber());
        dto.setName(goat.getName());
        dto.setBreeder(goat.getBreeder());
        dto.setOwnerName(goat.getOwnerName());
        dto.setBreed(goat.getBreed());
        dto.setColor(goat.getColor());
        dto.setStatus(goat.getStatus());
        dto.setGender(goat.getGender());
        dto.setCategory(goat.getCategory());
        dto.setTod(goat.getTod());
        dto.setToe(goat.getToe());
        dto.setBirthDate(goat.getBirthDate());
        dto.setActive(goat.isActive());

        if (goat.getFather() != null) {
            dto.setFather(goat.getFather().getName());
            dto.setRegistrationNumberFather(goat.getFather().getRegistrationNumber());
        }

        if (goat.getMother() != null) {
            dto.setMother(goat.getMother().getName());
            dto.setRegistrationNumberMother(goat.getMother().getRegistrationNumber());
        }

        if (goat.getGoatFarm() != null) {
            GoatFarmDTO goatFarmDTO = new GoatFarmDTO();
            goatFarmDTO.setId(goat.getGoatFarm().getId());
            goatFarmDTO.setName(goat.getGoatFarm().getName());
            if (goat.getGoatFarm().getOwner() != null){
                goatFarmDTO.setOwnerId(goat.getGoatFarm().getOwner().getId());
            } else {
                goatFarmDTO.setOwnerId(null);
            }

            if (goat.getGoatFarm().getAddress() != null){
                goatFarmDTO.setAddressId(goat.getGoatFarm().getAddress().getId());
            } else {
                goatFarmDTO.setAddressId(null);
            }

            goatFarmDTO.setTod(goat.getGoatFarm().getTod());
            dto.setGoatFarm(goatFarmDTO);
        } else {
            dto.setGoatFarm(null);
        }

        return dto;
    }
}