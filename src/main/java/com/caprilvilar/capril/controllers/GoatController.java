package com.caprilvilar.capril.controllers;

import com.caprilvilar.capril.dtos.GoatDTO;
import com.caprilvilar.capril.services.GoatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/goats")
public class GoatController {

    @Autowired
    public GoatService service;

    @GetMapping(value = "/{id}")
    public GoatDTO findById(@PathVariable Long id) {

        return service.findById(id);
    }

    @GetMapping
    public List<GoatDTO> findAll() {

        return service.findAll();
    }

    @PostMapping
    public GoatDTO insert(@RequestBody GoatDTO dto) {

        return service.insert(dto);
    }

    @PutMapping(value = "/{id}")
    public GoatDTO updateGoat(@PathVariable Long id, @RequestBody GoatDTO dto) {

        return service.updateGoat(id, dto);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteGoat(@PathVariable Long id) {
        service.deleteGoat(id);
    }
}
