package com.caprilvilar.capril.services;

import com.caprilvilar.capril.dtos.OwnerDTO;
import com.caprilvilar.capril.entities.Owner;
import com.caprilvilar.capril.mappers.OwnerMapper;
import com.caprilvilar.capril.repositories.OwnerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class OwnerService {

    private final OwnerRepository repository;
    private final OwnerMapper ownerMapper;

    public OwnerService(OwnerRepository repository, OwnerMapper ownerMapper) {
        this.repository = repository;
        this.ownerMapper = ownerMapper;
    }

    public OwnerDTO findById(Long id) {
        Owner owner = repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Elemento não encontrado " + id));
        return ownerMapper.dtoTo(owner);
    }

    public List<OwnerDTO> findAll(){
        List<Owner> owners = repository.findAll();
        return owners.stream().map(ownerMapper :: dtoTo).collect(Collectors.toUnmodifiableList());
    }

    public OwnerDTO insetOwner(OwnerDTO dto) {

        Owner owner = repository.save(ownerMapper.entityTo(dto));
        return ownerMapper.dtoTo(owner);
    }

    public OwnerDTO updateOwner(OwnerDTO dto, Long id) {

        Owner owner = repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Elemento não encontrado " + id));

        Owner ownerUpdate = ownerMapper.entityTo(dto);
        ownerUpdate.setId(owner.getId());
        ownerUpdate = repository.save(ownerUpdate);

      return ownerMapper.dtoTo(ownerUpdate);
    }

    public void delete(Long id) {
        Owner owner = repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Elemento não encontrado " + id));;
        repository.delete(owner);
    }
}
