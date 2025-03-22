package com.caprilvilar.capril.services;

import com.caprilvilar.capril.dtos.GoatFarmDTO;
import com.caprilvilar.capril.entities.GoatFarm;
import com.caprilvilar.capril.mappers.GoatFarmMapper;
import com.caprilvilar.capril.repositories.GoatFarmRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoatFarmService {

    @Autowired
    private GoatFarmRepository goatFarmRepository;

    @Autowired
    private GoatFarmMapper goatFarmMapper;

    @Transactional
    public GoatFarmDTO getGoatFarmById(Long id) {
        GoatFarm goatFarm = goatFarmRepository.findGoatFarmWithPhonesById(id);
        if (goatFarm == null) {
            return null;
        }
        return goatFarmMapper.toDTO(goatFarm);
    }
}