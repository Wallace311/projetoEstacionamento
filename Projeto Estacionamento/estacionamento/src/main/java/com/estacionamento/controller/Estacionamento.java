package com.estacionamento.controller;

import java.time.LocalTime;

public class Estacionamento {
    private int vagas;
    private boolean funcionando = false;
    LocalTime time = LocalTime.now();


    public Estacionamento(int vagas){
        this.setVagas(vagas);
        abriEstacionamento();
        fecharEstacionamento();
    }


    public void abriEstacionamento(){
        if (time.getHour() >= 8 || time.getMinute() > 0 ) {
            this.setFuncionando(true);
        }
    }
    public void fecharEstacionamento(){
        if (time.getHour() >= 19 ) {
            this.setFuncionando(false);
        }
    }

    public void status(){
        System.out.println("Número de Vagas: " + this.getVagas());
        if (isFuncionando()) {
            System.out.println("O Estacionamento está aberto!");
        }else{
            System.out.println("O Estacionamento está fechado!");
        }
    }

    public void setTime(LocalTime time) {this.time = time;}
    public void setFuncionando(boolean funcionando) {this.funcionando = funcionando;}
    public int getVagas() {return vagas;}
    public boolean isFuncionando() {return funcionando;}
    public void setVagas(int vagas) {this.vagas = vagas;}
}
