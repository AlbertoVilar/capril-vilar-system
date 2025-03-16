package com.caprilvilar.capril.services;

import com.caprilvilar.capril.dtos.GoatDTO;
import com.caprilvilar.capril.entities.Goat;
import com.caprilvilar.capril.mappers.GoatMapper;
import com.caprilvilar.capril.repositories.GoatFarmRepository;
import com.caprilvilar.capril.repositories.GoatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class GoatService {

    private final GoatRepository repository;
    private final GoatMapper mapper;
    private final GoatFarmRepository goatFarmRepository;

    @Autowired
    public GoatService(GoatRepository repository, GoatMapper mapper, GoatFarmRepository goatFarmRepository) {
        this.repository = repository;
        this.mapper = mapper;
        this.goatFarmRepository = goatFarmRepository;
    }

    @Transactional(readOnly = true)
    public GoatDTO findById(String id) {
        Goat goat = repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Elemento não encontrado"));
        return mapper.toDTO(goat);
    }

    @Transactional(readOnly = true)
    public List<GoatDTO> findAll() {
        List<Goat> goats = repository.findAll();
        return goats.stream().map(mapper::toDTO).collect(Collectors.toUnmodifiableList());
    }

    @Transactional
    public GoatDTO insert(GoatDTO dto) {
        Goat goat = mapper.toEntity(dto, repository, goatFarmRepository);
        goat = repository.save(goat);
        return mapper.toDTO(goat);
    }

    @Transactional
    public GoatDTO updateGoat(String id, GoatDTO dto) {
        Goat goatExist = repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Elemento não encontrado"));

        Goat goat = mapper.toEntity(dto, repository, goatFarmRepository);
        goat.setRegistrationNumber(goatExist.getRegistrationNumber());
        goat = repository.save(goat);

        return mapper.toDTO(goat);
    }

    @Transactional
    public void deleteGoat(String id) {
        // Update children to remove reference to the father
        List<Goat> fatherChildren = repository.findByFatherRegistrationNumber(id);
        fatherChildren.forEach(child -> child.setFather(null));

        // Update children to remove reference to the mother
        List<Goat> motherChildren = repository.findByMotherRegistrationNumber(id);
        motherChildren.forEach(child -> child.setMother(null));

        // Save changes before deletion
        repository.saveAll(fatherChildren);
        repository.saveAll(motherChildren);

        // Now delete safely
        repository.deleteById(id);
    }
}