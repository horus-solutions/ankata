package com.horus.ankata.stock.controller;


import com.horus.ankata.core.domain.common.ComCivilites;
import com.horus.ankata.core.repository.CiviliteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StockController {
    private CiviliteRepository civiliteRepository;

    public StockController(CiviliteRepository civiliteRepository){
        this.civiliteRepository = civiliteRepository;
    }

    @GetMapping("/civilites")
    public List<ComCivilites> getCivilites(){
        List<ComCivilites> civilites = this.civiliteRepository.findAll();

        return civilites;
    }
}
