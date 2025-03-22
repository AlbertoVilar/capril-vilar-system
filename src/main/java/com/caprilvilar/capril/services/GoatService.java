package com.caprilvilar.capril.services;

import com.caprilvilar.capril.dtos.GoatDTO;
import com.caprilvilar.capril.entities.Goat;
import com.caprilvilar.capril.mappers.GoatMapper;
import com.caprilvilar.capril.repositories.GoatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GoatService {

    private final GoatRepository repository;
    private final GoatMapper goatMapper;

    @Autowired
    public GoatService(GoatRepository repository, GoatMapper goatMapper) {
        this.repository = repository;
        this.goatMapper = goatMapper;
    }

    public GoatDTO findById(String id) {
        Goat goat = repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Goat not found with ID: " + id));
        return goatMapper.toDTO(goat);
    }

    public GoatDTO findGoatById(String registrationNumber) {
        Optional<Goat> goatOptional = repository. findGoatWithParents(registrationNumber);
        Goat goat = goatOptional.orElseThrow(() -> new NoSuchElementException("Goat not found with registrationNumber: " + registrationNumber));
        return goatMapper.toDTO(goat);
    }

    /* Removido o método findGoatWithGenealogy */

    @Transactional(readOnly = true)
    public List<GoatDTO> findAll() {
        List<Goat> goats = repository.findAll();
        return goats.stream().map(goatMapper::toDTO).collect(Collectors.toUnmodifiableList());
    }

    @Transactional
    public GoatDTO insert(GoatDTO dto) {
        Goat goat = goatMapper.toGoat(dto);
        goat = repository.save(goat);
        return goatMapper.toDTO(goat);
    }

    @Transactional
    public GoatDTO update(String id, GoatDTO dto) {
        Goat goat = repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Goat not found for ID: " + id));

        goat.setName(dto.getName());
        goat.setBreed(dto.getBreed());

        goat = repository.save(goat);
        return goatMapper.toDTO(goat);
    }

    /* Removido o método testFindGoatWithGenealogy */
}