package br.futurodev.joinville.spring.entidades;

import java.util.ArrayList;
import java.util.List;

public class Contrato {

    private static final List<Contrato> contratos = new ArrayList<>();
    private static Long sequence = 1L;

    private Long id;
    private Coletor coletor;
    private List <Rota> rotas = new ArrayList<>();


}
