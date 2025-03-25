package com.caprilvilar.capril.mappers;

import com.caprilvilar.capril.dtos.OwnerNameDTO;
import com.caprilvilar.capril.entities.Owner;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OwnerNameMapper {

    @Mapping(source = "name", target = "name")
    OwnerNameDTO toDTO(Owner owner);
}