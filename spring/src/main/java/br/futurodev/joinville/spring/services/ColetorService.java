package br.futurodev.joinville.spring.services;

import br.futurodev.joinville.spring.entidades.Coletor;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class ColetorService {

    public Coletor create(Coletor coletor){
        return Coletor.addColetor(coletor);
    }

    public List<Coletor> findAll(){
        return Coletor.getColetores();
    }

    public Coletor findById(Long id) {
        for (Coletor coletor : Coletor.getColetores()) {
            if (coletor.getId().equals(id)) {
                return coletor;
            }
        }
        return null;
    }
}
