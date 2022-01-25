package com.dio.dominio;


import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class Cursos extends Treinamentos {

    @Override
    public int calcularXP() {
        return XP_PADRAO * this.getCargaHoraria();
    }

    public Cursos() {
    }

    @Override
    public String toString() {
        return "\nCurso " + this.getTitulo() + "\n Com carga horaria de "
                + this.getCargaHoraria() + " horas.\n"
                + this.getDescricao() +
                "\n-----------------------------------------" ;
    }
}
