package com.caprilvilar.capril.controllers;

import com.caprilvilar.capril.dtos.GoatDTO;
import com.caprilvilar.capril.services.GoatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/goats")
public class GoatController {

    @Autowired
    public GoatService service;

    @GetMapping(value = "/{id}")
    public GoatDTO findById(@PathVariable String id) {

        return service.findById(id);
    }

    @PostMapping
    public GoatDTO insert(@RequestBody GoatDTO dto) {

        return service.insert(dto);
    }
}
