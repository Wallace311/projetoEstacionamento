package com.estacionamento.model;


public class Carro {
    private String modelo;
    private String cor;
    private int ano;
    private String placa;
    private boolean entrada;


    public Carro(String modelo, String cor, int ano, String placa){
        this.setModelo(modelo);
        this.setCor(cor);
        this.setAno(ano);
        this.setPlaca(placa);
    }

    public void entrarEstacionamento(){}
    public boolean sairEstacionaento(){
        return true;
    }


    public void setAno(int ano) {this.ano = ano;}
    public void setCor(String cor) {this.cor = cor;}
    public void setModelo(String modelo) {this.modelo = modelo;}
    public void setPlaca(String placa) {this.placa = placa;}
    public void setEntrada(boolean entrada) {this.entrada = entrada;}
    public int getAno() {return ano;}
    public String getCor() {return cor;}
    public String getModelo() {return modelo;}
    public String getPlaca() {return placa;}
    public boolean isEntrada() {return entrada;}
}
