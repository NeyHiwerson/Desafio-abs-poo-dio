package com.dio.dominio;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dev {
    private String nome;
    private Set<Treinamentos> treinamentosInscritos = new LinkedHashSet<>();
    private Set<Treinamentos> treinamentosConcluidos = new LinkedHashSet<>();


    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.treinamentosInscritos.addAll(bootcamp.getTreinamentos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Treinamentos> treinamento = this.treinamentosInscritos.stream().findFirst();
        if (treinamento.isPresent()){
            this.treinamentosConcluidos.add(treinamento.get());
            this.treinamentosInscritos.remove(treinamento.get());
        } else {
            System.out.println("Você não esta matriculado em nenhum Bootcamp");
        }

    }

    public int calcularTotalXP() {
        return this.treinamentosConcluidos
                .stream()
                .mapToInt(Treinamentos::calcularXP)
                .sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(treinamentosInscritos, dev.treinamentosInscritos) && Objects.equals(treinamentosConcluidos, dev.treinamentosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, treinamentosInscritos, treinamentosConcluidos);
    }
}
