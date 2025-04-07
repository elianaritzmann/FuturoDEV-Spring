package br.futurodev.joinville.spring.services;

import br.futurodev.joinville.spring.entidades.Coletor;
import br.futurodev.joinville.spring.entidades.Contrato;
import br.futurodev.joinville.spring.entidades.Rota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContratoService {

    @Autowired
    private ColetorService coletorService;

    @Autowired
    private RotasService rotasService;


    public Contrato create(Contrato contrato){
        Coletor coletor = coletorService.findById
                (contrato.getColetor().getId());

        if (coletor == null) {return null;}
        else { contrato.setColetor(coletor);
        }
        List<Rota> rotas = new ArrayList<>();
        for(Rota rota : contrato.getRotas()){
            Rota acheRota = rotasService.findById(rota.getId());
            if (acheRota == null) {return null;}
            else { rotas.add(acheRota);}

        } contrato.setRotas(rotas);
          return (Contrato) Contrato.getContratos();

    }

    public List<Contrato> findAll(){
        return Contrato.getContratos();
    }

}
