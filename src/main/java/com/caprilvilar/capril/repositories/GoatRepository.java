package com.caprilvilar.capril.repositories;

import com.caprilvilar.capril.entities.Goat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GoatRepository extends JpaRepository<Goat, String> {

    @Query("SELECT g FROM Goat g " +
            "LEFT JOIN FETCH g.father f " +
            "LEFT JOIN FETCH g.mother m " +
            "WHERE g.registrationNumber = :registrationNumber")
    Optional<Goat> findGoatWithParents(@Param("registrationNumber") String registrationNumber);

    @Query("SELECT g, o.name FROM Goat g " +
            "LEFT JOIN FETCH g.father f " +
            "LEFT JOIN FETCH g.mother m " +
            "LEFT JOIN g.goatFarm gf " +
            "LEFT JOIN gf.owner o " +
            "WHERE g.registrationNumber = :registrationNumber")
    Optional<Object[]> findGoatWithParentsAndOwnerName(@Param("registrationNumber") String registrationNumber);
}