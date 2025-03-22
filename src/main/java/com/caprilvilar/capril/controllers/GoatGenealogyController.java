package com.caprilvilar.capril.controllers;

import com.caprilvilar.capril.dtos.GoatGenealogyDTO; // Importe GoatGenealogyDTO
import com.caprilvilar.capril.services.GoatGenealogyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goat-genealogies")
public class GoatGenealogyController {

    private final GoatGenealogyService goatGenealogyService;

    @Autowired
    public GoatGenealogyController(GoatGenealogyService goatGenealogyService) {
        this.goatGenealogyService = goatGenealogyService;
    }

    @GetMapping("/{registrationNumber}")
    public ResponseEntity<GoatGenealogyDTO> getGoatGenealogy(@PathVariable String registrationNumber) {
        GoatGenealogyDTO goatGenealogyDTO = goatGenealogyService.findGoatGenealogy(registrationNumber);
        return ResponseEntity.ok(goatGenealogyDTO);
    }
}