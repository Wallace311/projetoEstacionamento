package com.estacionamento.model;

import com.estacionamento.controller.Estacionamento;
import com.estacionamento.controller.Pagamento;

public class DonoCarro extends Pessoa{

    private Pagamento pagamento;
    private Carro carro;

    public DonoCarro(String nome, int nasc, String modelo, String cor, String placa, int ano) {
        super(nome, nasc);

        carro =  new Carro(modelo, cor, ano, placa);
        
    }
    public void darEntrada(Estacionamento est){
            est.setVagas(est.getVagas() - 1);
    }
    
    public boolean pagarEstacionamento(){
        if (carro.sairEstacionaento()) {
            return pagamento.realizarPagamento();
        }else{
            System.out.println("Pagamento Negado!!");
            return false;
        }
    }



}
