package br.futurodev.joinville.spring.entidades;

import java.util.ArrayList;
import java.util.List;

public class Coletor {

    private static final List<Coletor> coletores = new ArrayList<>();
    public static Long sequence =1L;
    private Long id ;
    private String nome;
    private String descricao;

    public static List<Coletor> getColetores() {
        return coletores;
    }
    public static Coletor addColetor( Coletor coletor){
        coletores.add(coletor);
        return coletor;
    }


    public void controleId(){
        this.id= sequence++;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
