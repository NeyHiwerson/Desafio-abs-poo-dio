package com.dio.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Treinamentos {

    protected static final int XP_PADRAO = 10;
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public abstract int calcularXP();

}


