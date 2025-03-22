package com.caprilvilar.capril.repositories;

import com.caprilvilar.capril.entities.GoatFarm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface GoatFarmRepository extends JpaRepository<GoatFarm, Long> {

    @Query("SELECT gf FROM GoatFarm gf LEFT JOIN FETCH gf.phones WHERE gf.id = :id")
    GoatFarm findGoatFarmWithPhonesById(@Param("id") Long id);
}
