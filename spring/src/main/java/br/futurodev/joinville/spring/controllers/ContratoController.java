package br.futurodev.joinville.spring.controllers;

import br.futurodev.joinville.spring.entidades.Contrato;
import br.futurodev.joinville.spring.services.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contratos")
public class ContratoController {

    @Autowired
    private ContratoService service;

    public ContratoService getService() {
        return service;
    }

    public void setService(ContratoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Contrato> get(){
        return service.findAll();
    }

    @PostMapping
    public Contrato post(@RequestBody Contrato Contrato){
        return service.create(Contrato);
    }
    }

