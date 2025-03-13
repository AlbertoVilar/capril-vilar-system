package com.caprilvilar.capril.services;

import com.caprilvilar.capril.dtos.GoatDTO;
import com.caprilvilar.capril.entities.Goat;
import com.caprilvilar.capril.repositories.GoatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;
@Service
public class GoatService {

    private final GoatRepository repository;

    @Autowired
    public GoatService(GoatRepository repository) {
        this.repository = repository;
    }

    public GoatDTO findById(String id) {
        Goat goat = repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Elemento não encontrado"));

        return new GoatDTO(goat);
    }

    public GoatDTO insert(GoatDTO dto) {
        Goat goat = new Goat(dto);
        goat = repository.save(goat);
        return new GoatDTO(goat);
    }



}
