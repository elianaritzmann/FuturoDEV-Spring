package br.futurodev.joinville.spring.entidades;

import java.util.ArrayList;
import java.util.List;

public class Contrato {

    private static final List<Contrato> contratos = new ArrayList<>();
    public static Long sequence =1L;
    private Long id ;
    private Coletor coletor;
    private List<Rota> rotas = new ArrayList<>();

    public static List<Contrato> getContratos() {
        return contratos;
    }

    public static Contrato addContrato(Contrato contrato){
        contratos.add(contrato);
        contrato.controleContratoId();
        return contrato;
    }

    public void controleContratoId(){
        this.id= sequence++;
    }

    public Long getId() {
        return id;
    }

    public Coletor getColetor() {
        return coletor;
    }

    public void setColetor(Coletor coletor) {
        this.coletor = coletor;
    }

    public List<Rota> getRotas() {
        return rotas;
    }

    public void setRotas(List<Rota> rotas) {
        this.rotas = rotas;
    }
}
