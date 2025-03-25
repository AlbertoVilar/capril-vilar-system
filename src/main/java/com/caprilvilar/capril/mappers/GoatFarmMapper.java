package com.caprilvilar.capril.mappers;

import com.caprilvilar.capril.dtos.*;
import com.caprilvilar.capril.entities.GoatFarm;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {GoatSimpleMapper.class, AddressMapper.class, OwnerNameMapper.class, PhoneMapper.class}) // Usando OwnerNameMapper
public interface GoatFarmMapper {

    @Mapping(source = "address", target = "address")
    @Mapping(source = "owner", target = "ownerName") // Mapeando para OwnerNameDTO
    @Mapping(source = "phones", target = "phones")
    @Mapping(source = "goats", target = "goats")
    GoatFarmDTO toDTO(GoatFarm goatFarm);

    @Mapping(source = "address", target = "address")
    @Mapping(source = "ownerName", target = "owner") // Mapeando de OwnerNameDTO
    @Mapping(source = "phones", target = "phones")
    @Mapping(source = "goats", target = "goats")
    GoatFarm toEntity(GoatFarmDTO goatFarmDTO);
}