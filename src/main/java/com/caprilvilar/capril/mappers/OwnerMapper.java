package com.caprilvilar.capril.mappers;

import com.caprilvilar.capril.dtos.OwnerDTO;
import com.caprilvilar.capril.entities.Owner;
import org.springframework.stereotype.Component;

@Component
public class OwnerMapper {

    public Owner entityTo(OwnerDTO ownerDTO) {
        Owner owner = new Owner();
        owner.setId(ownerDTO.getId());
        owner.setName(ownerDTO.getName());
        owner.setEmail(ownerDTO.getEmail());
        return owner;
    }

    public OwnerDTO dtoTo(Owner owner) {
        OwnerDTO dto = new OwnerDTO();
        dto.setId(owner.getId());
        dto.setName(owner.getName());
        dto.setEmail(owner.getEmail());
        return dto;
    }
}