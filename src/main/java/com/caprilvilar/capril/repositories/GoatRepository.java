package com.caprilvilar.capril.repositories;

import com.caprilvilar.capril.dtos.GoatDTO;
import com.caprilvilar.capril.entities.Goat;
import com.caprilvilar.capril.services.GoatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface GoatRepository extends JpaRepository<Goat, String> {


}
