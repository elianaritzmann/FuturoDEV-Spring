package br.futurodev.joinville.spring.controllers;

import br.futurodev.joinville.spring.entidades.Rota;
import br.futurodev.joinville.spring.services.RotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class RotaController {

    @Autowired
    private RotasService service;

    @GetMapping
    public List<Rota> get(){
        return service.findAll();
    }

    @PostMapping
    public Rota post(@RequestBody Rota rota){
        return service.create(rota);
    }
}
