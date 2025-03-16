package com.caprilvilar.capril.repositories;

import com.caprilvilar.capril.entities.GoatFarm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoatFarmRepository extends JpaRepository<GoatFarm, Long> {

    GoatFarm findGoatFarmById(Long id);
}
