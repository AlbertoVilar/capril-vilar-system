package com.caprilvilar.capril.mappers;

import com.caprilvilar.capril.dtos.OwnerDTO;
import com.caprilvilar.capril.entities.Owner;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OwnerMapper {

    OwnerDTO toDTO(Owner owner);

    Owner toEntity(OwnerDTO ownerDTO);
}