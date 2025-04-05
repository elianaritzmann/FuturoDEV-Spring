package br.futurodev.joinville.spring.services;

import br.futurodev.joinville.spring.entidades.Coletor;
import br.futurodev.joinville.spring.entidades.Rota;

import java.util.List;

public class RotasService {

    public Rota create(Rota rota){
        return Rota.addRota(rota);
    }

    public List<Rota> findAll(){
        return Rota.getRotas();
    }
    public Rota findById(Long id) {
        for (Rota rota : Rota.getRotas()) {
            if (rota.getId().equals(id)) {
                return rota;
            }
        }
        return null;
    }
}
