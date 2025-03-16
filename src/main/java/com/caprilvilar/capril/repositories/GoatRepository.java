package com.caprilvilar.capril.repositories;

import com.caprilvilar.capril.entities.Goat;
import com.caprilvilar.capril.entities.GoatFarm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoatRepository extends JpaRepository<Goat, String> {


    List<Goat> findByFatherRegistrationNumber(String fatherId);
    List<Goat> findByMotherRegistrationNumber(String motherId);

    Goat findByRegistrationNumber(String registrationNumberParents);

}
