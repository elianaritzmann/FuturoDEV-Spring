package br.futurodev.joinville.spring.controllers;

import br.futurodev.joinville.spring.entidades.Coletor;
import br.futurodev.joinville.spring.services.ColetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/coletores")
public class ColetorController {

    @Autowired
    private ColetorService service;

    public ColetorService getService() {
        return service;
    }

    public void setService(ColetorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Coletor> get(){
        return service.findAll();
    }

    @PostMapping
    public Coletor post(@RequestBody Coletor coletor){
        return service.create(coletor);
    }
    }

