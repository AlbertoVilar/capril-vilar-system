package com.caprilvilar.capril.services;

import com.caprilvilar.capril.dtos.OwnerDTO;
import com.caprilvilar.capril.entities.Owner;
import com.caprilvilar.capril.mappers.OwnerMapper;
import com.caprilvilar.capril.repositories.GoatFarmRepository;
import com.caprilvilar.capril.repositories.OwnerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OwnerService {

    private final OwnerRepository repository;
    private final OwnerMapper ownerMapper;
    private final GoatFarmRepository goatFarmRepository;

    public OwnerService(OwnerRepository repository, OwnerMapper ownerMapper, GoatFarmRepository goatFarmRepository) {
        this.repository = repository;
        this.ownerMapper = ownerMapper;
        this.goatFarmRepository = goatFarmRepository;
    }

    public OwnerDTO findById(Long id) {
        Owner owner = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Owner not found with id: " + id));
        return ownerMapper.dtoTo(owner);
    }

    public List<OwnerDTO> findAll() {
        List<Owner> owners = repository.findAll();
        return owners.stream().map(ownerMapper::dtoTo).collect(Collectors.toUnmodifiableList());
    }

    public OwnerDTO insertOwner(OwnerDTO dto) {
        Owner owner = ownerMapper.entityTo(dto);
        Owner savedOwner = repository.save(owner);
        return ownerMapper.dtoTo(savedOwner);
    }

    public OwnerDTO updateOwner(OwnerDTO dto, Long id) {
        Owner existingOwner = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Owner not found with id: " + id));


        Owner updatedOwner = ownerMapper.entityTo(dto);
        updatedOwner.setId(existingOwner.getId()); // Garante que o ID seja preservado
        updatedOwner = repository.save(updatedOwner);

        return ownerMapper.dtoTo(updatedOwner);
    }

    public void delete(Long id) {
        Owner owner = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Owner not found with id: " + id));
        repository.delete(owner);
    }
}