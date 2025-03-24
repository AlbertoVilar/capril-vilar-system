package com.caprilvilar.capril.repositories;

import com.caprilvilar.capril.dtos.GoatGenealogyDTO;
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

    @Query("SELECT new com.caprilvilar.capril.dtos.GoatGenealogyDTO(" +
            "g.registrationNumber, g.name, o.name, g.breed, g.color, " +
            "CASE g.status " +
            "   WHEN com.caprilvilar.capril.entities.GoatStatus.ATIVO THEN 'ACTIVE' " +
            "   WHEN com.caprilvilar.capril.entities.GoatStatus.INATIVO THEN 'INACTIVE' " +
            "   WHEN com.caprilvilar.capril.entities.GoatStatus.ATIVO THEN 'PENDING' " +
            "   ELSE 'UNKNOWN' " +
            "END, " +
            "g.gender, g.category, g.tod, g.toe, g.birthDate, g.active) " +
            "FROM Goat g " +
            "LEFT JOIN g.goatFarm gf " +
            "LEFT JOIN gf.owner o " +
            "WHERE g.registrationNumber = :registrationNumber")
    Optional<GoatGenealogyDTO> findGoatGenealogy(@Param("registrationNumber") String registrationNumber);
}