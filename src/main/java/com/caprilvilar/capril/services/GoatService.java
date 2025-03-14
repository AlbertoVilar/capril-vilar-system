package com.caprilvilar.capril.services;

import com.caprilvilar.capril.dtos.GoatDTO;
import com.caprilvilar.capril.entities.Goat;
import com.caprilvilar.capril.mapper.GoatMapper;
import com.caprilvilar.capril.repositories.GoatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class GoatService {

    @Autowired
    private final GoatRepository repository;

    public GoatService(GoatRepository repository) {
        this.repository = repository;
    }
    @Autowired
    public GoatMapper mapper;

    public GoatDTO findById(Long id) {
        Goat goat = repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Elemento não encontrado"));

        return mapper.toDTO(goat);
    }

    public List<GoatDTO> findAll() {
        List<Goat> goats = repository.findAll();
        return mapper.toDTOList(goats);
    }

    public GoatDTO insert(GoatDTO dto) {
        Goat goat = mapper.toEntity(dto);
        goat = repository.save(goat);
        return mapper.toDTO(goat);
    }

    public GoatDTO updateGoat(Long id, GoatDTO dto) {
        Goat goatExist = repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Elemento não encontrado"));

        Goat goat = mapper.toEntity(dto);
        goat.setRegistrationNumber(goatExist.getRegistrationNumber());
        repository.save(goat);

        return mapper.toDTO(goat);
    }

    public void deleteGoat(Long id) {

        repository.deleteById(id);
    }



}
