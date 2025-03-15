package com.caprilvilar.capril.services;

import com.caprilvilar.capril.dtos.GoatDTO;
import com.caprilvilar.capril.entities.Goat;
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

    @Autowired
    public GoatService(GoatRepository repository) {
        this.repository = repository;
    }

    public GoatDTO findById(String id) {
        Goat goat = repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Elemento não encontrado"));

        return new GoatDTO(goat);
    }

    public List<GoatDTO> findAll() {
        List<Goat> goats = repository.findAll();
        return goats.stream().map(GoatDTO :: new).collect(Collectors.toUnmodifiableList());
    }

    public GoatDTO insert(GoatDTO dto) {
        Goat goat = new Goat(dto);
        goat = repository.save(goat);
        return new GoatDTO(goat);
    }

    public GoatDTO updateGoat(String id, GoatDTO dto) {
        Goat goatExist = repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Elemento não encontrado"));

        Goat goat = new Goat(dto);
        goat.setRegistrationNumber(goatExist.getRegistrationNumber());
        repository.save(goat);

        return new GoatDTO(goat);
    }


   
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
