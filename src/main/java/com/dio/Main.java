package com.dio;

import com.dio.dominio.Bootcamp;
import com.dio.dominio.Cursos;
import com.dio.dominio.Dev;
import com.dio.dominio.Mentorias;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mentorias mentoria01 = new Mentorias();
        mentoria01.setTitulo("Java primeiros passos");
        mentoria01.setDescricao("Descrição da mentoria#01 Java");
        mentoria01.setData(LocalDate.of(2022, 01, 25));
        mentoria01.setCargaHoraria(8);

        Mentorias mentoria02 = new Mentorias();
        mentoria02.setTitulo("Java abrindo a cabeça");
        mentoria02.setDescricao("Descrição da mentoria#02 Java");
        mentoria02.setData(LocalDate.of(2022, 01, 28));
        mentoria02.setCargaHoraria(10);

        Mentorias mentoria03 = new Mentorias();
        mentoria03.setTitulo("Java Codando Tudo Sem Limites");
        mentoria03.setDescricao("Descrição da mentoria#03 Java");
        mentoria03.setData(LocalDate.of(2022, 01, 30));
        mentoria03.setCargaHoraria(16);

        Cursos curso01 = new Cursos();
        curso01.setTitulo("se integrando ao Java");
        curso01.setDescricao("Conhecendo funcionamento e as ferramentas");
        curso01.setCargaHoraria(4);

        Cursos curso02 = new Cursos();
        curso02.setTitulo("Java primeiros programas");
        curso02.setDescricao("Codando seus primeiros códigos");
        curso02.setCargaHoraria(6);

        Cursos curso03 = new Cursos();
        curso03.setTitulo("Subindo a Barra com Java");
        curso03.setDescricao("Aprendendo e desenvolvendo Codigos mais complexos");
        curso03.setCargaHoraria(8);

//        System.out.println(mentoria01.toString());
//        System.out.println("-------------------------------------------------");
//        System.out.println(mentoria02.toString());
//        System.out.println("-------------------------------------------------");
//        System.out.println(mentoria03.toString());
//        System.out.println("-------------------------------------------------");
//        System.out.println(curso01.toString());
//        System.out.println("-------------------------------------------------");
//        System.out.println(curso02.toString());
//        System.out.println("-------------------------------------------------");
//        System.out.println(curso03.toString());
//        System.out.println("-------------------------------------------------");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getTreinamentos().add(curso01);
        bootcamp.getTreinamentos().add(curso02);
        bootcamp.getTreinamentos().add(mentoria01);

        Dev dev01 = new Dev();
        dev01.setNome("Ney");
        dev01.inscreverBootcamp(bootcamp);
        //System.out.println("Conteudos inscritos " + dev01.getNome() + " : " + dev01.getTreinamentosInscritos());
        System.out.println("Conteudos Concluidos " + dev01.getNome() + " : " + dev01.getTreinamentosConcluidos());
        dev01.progredir();
        System.out.println("Conteudos Concluidos " + dev01.getNome() + " : " + dev01.getTreinamentosConcluidos());
        System.out.println("Conteudos inscritos " + dev01.getNome() + " : " + dev01.getTreinamentosInscritos());
        System.out.println(dev01.calcularTotalXP());

        Dev dev02 = new Dev();
        dev02.setNome("Priscila");
        dev02.inscreverBootcamp(bootcamp);
        //System.out.println("Conteudos inscritos " + dev02.getNome() + " : " + dev02.getTreinamentosInscritos());
        System.out.println("Conteudos Concuidos " + dev02.getNome() + " : " + dev02.getTreinamentosConcluidos());
        dev02.progredir();
        dev02.progredir();
        dev02.progredir();
        System.out.println("Conteudos Concuidos " + dev02.getNome() + " : " + dev02.getTreinamentosConcluidos());
        System.out.println(dev02.calcularTotalXP());

        Dev dev03 = new Dev();
        dev03.setNome("João");
        dev03.inscreverBootcamp(bootcamp);

        Dev dev04 = new Dev();
        dev04.setNome("Maria");
        dev04.inscreverBootcamp(bootcamp);

    }

}
