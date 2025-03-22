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

    @GetMapping
    public List<GoatDTO> findAll() {
        return service.findAll();
    }

    @PostMapping
    public GoatDTO insert(@RequestBody GoatDTO dto) {
        return service.insert(dto);
    }

    @PutMapping(value = "/{id}")
    public GoatDTO updateGoat(@PathVariable String id, @RequestBody GoatDTO dto) {
        return service.update(id, dto);
    }
}