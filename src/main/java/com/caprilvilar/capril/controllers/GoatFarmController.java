package com.caprilvilar.capril.controllers;

import com.caprilvilar.capril.dtos.GoatFarmDTO;
import com.caprilvilar.capril.services.GoatFarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "goatfarms")
public class GoatFarmController {

    @Autowired
    private GoatFarmService service;

    @GetMapping("/{id}")
    public GoatFarmDTO findById(@PathVariable Long id) {
        return service.getGoatFarmById(id);
    }
}
