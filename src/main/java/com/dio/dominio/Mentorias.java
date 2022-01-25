package com.dio.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mentorias extends Treinamentos {

    private LocalDate data;

    @Override
    public int calcularXP() {
        return XP_PADRAO * this.getCargaHoraria();
    }

    @Override
    public String toString() {
        return "\nMentoria " + this.getTitulo() + " data " + this.getData() +
                "\n Com carga horaria de " + this.getCargaHoraria() + " horas.\n"
                + this.getDescricao() +
                "\n-----------------------------------------";
    }
}
