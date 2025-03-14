package com.caprilvilar.capril.repositories;

import com.caprilvilar.capril.entities.Goat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoatRepository extends JpaRepository<Goat, Long> {

}
