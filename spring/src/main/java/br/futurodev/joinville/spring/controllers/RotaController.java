package br.futurodev.joinville.spring.controllers;

import br.futurodev.joinville.spring.entidades.Rota;
import br.futurodev.joinville.spring.services.RotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/rotas")
public class RotaController {

    @Autowired
    private RotasService service;

    public RotasService getService() {
        return service;
    }

    public void setService(RotasService service) {
        this.service = service;
    }

    @GetMapping
    public List<Rota> get(){
        return service.findAll();
    }

    @PostMapping
    public Rota post(@RequestBody Rota rota){
        return service.create(rota);
    }
}
