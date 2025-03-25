package com.caprilvilar.capril.mappers;

import com.caprilvilar.capril.dtos.PhoneDTO;
import com.caprilvilar.capril.entities.Phone;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PhoneMapper {
    PhoneDTO toDTO(Phone phone);
}