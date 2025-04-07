package br.futurodev.joinville.spring.entidades;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Rota {

    private static final List<Rota> rotas = new ArrayList<>();
    private static Long sequence =1L;
    private Long id;
    private String descricao;
    private String areadeAbragencia;
    private BigDecimal percentualEficiencia;

    public void controleId(){
        this.id= sequence++;
    }

    public static Rota addRota( Rota rota){
        rotas.add(rota);
        rota.controleId();
        return rota;
    }
    public static List<Rota> getRotas(){
        return rotas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAreadeAbragencia() {
        return areadeAbragencia;
    }

    public void setAreadeAbragencia(String areadeAbragencia) {
        this.areadeAbragencia = areadeAbragencia;
    }

    public BigDecimal getPercentualEficiencia() {
        return percentualEficiencia;
    }

    public void setPercentualEficiencia(BigDecimal percentualEficiencia) {
        this.percentualEficiencia = percentualEficiencia;
    }

    public Long getId() {
        return id;
    }
}
