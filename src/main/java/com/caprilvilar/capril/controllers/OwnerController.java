package com.caprilvilar.capril.controllers;

import com.caprilvilar.capril.dtos.GoatDTO;
import com.caprilvilar.capril.dtos.OwnerDTO;
import com.caprilvilar.capril.services.OwnerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/owners")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping(value = "/{id}")
    public OwnerDTO findById(@PathVariable Long id) {
        return ownerService.findById(id);
    }

    @GetMapping
    public List<OwnerDTO> findAll() {

        return ownerService.findAll();
    }

    @PostMapping
    public OwnerDTO insertOwner(@RequestBody OwnerDTO dto) {

        return ownerService.insertOwner(dto);
    }

    @PutMapping(value = "/{id}")
    public OwnerDTO updateOwner(@RequestBody OwnerDTO dto, @PathVariable Long id) {

        return ownerService.updateOwner(dto, id);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {

        ownerService.delete(id);
    }
}

