package com.caprilvilar.capril.mappers;

import com.caprilvilar.capril.dtos.AddressDTO;
import com.caprilvilar.capril.entities.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    AddressDTO toDTO(Address address);
}
