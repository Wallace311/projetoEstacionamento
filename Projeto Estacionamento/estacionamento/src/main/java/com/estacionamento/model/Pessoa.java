package com.estacionamento.model;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private int nasc;
    LocalDate data = LocalDate.now();


    public Pessoa(String nome, int nasc){
        this.setNome(nome);
        this.setNasc(nasc);
    }

    public void fazerAniversário(){}

    public void setNasc(int nasc) {this.nasc = nasc;}
    public void setNome(String nome) {this.nome = nome;}
    public int getNasc() {return nasc;}
    public String getNome() {return nome;}
}
