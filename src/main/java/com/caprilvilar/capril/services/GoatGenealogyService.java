package com.caprilvilar.capril.services;

import com.caprilvilar.capril.dtos.GoatGenealogyDTO;
import com.caprilvilar.capril.entities.Goat;
import com.caprilvilar.capril.mappers.GoatGenealogyMapper;
import com.caprilvilar.capril.repositories.GoatRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class GoatGenealogyService {

    private final GoatRepository goatRepository;
    private final GoatGenealogyMapper goatGenealogyMapper;

    @Autowired
    public GoatGenealogyService(GoatRepository goatRepository, GoatGenealogyMapper goatGenealogyMapper) {
        this.goatRepository = goatRepository;
        this.goatGenealogyMapper = goatGenealogyMapper;
    }

    public GoatGenealogyDTO findGoatGenealogy(String registrationNumber) {
        Optional<Goat> goatOptional = goatRepository.findGoatWithParents(registrationNumber);

        if (goatOptional.isPresent()) {
            Goat goat = goatOptional.get();
            return goatGenealogyMapper.toDTO(goat);
        } else {
            throw new EntityNotFoundException("Goat with registration number " + registrationNumber + " not found");
        }
    }
}