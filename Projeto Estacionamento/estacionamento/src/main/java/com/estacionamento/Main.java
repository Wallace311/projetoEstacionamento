package com.estacionamento;


import com.estacionamento.controller.Estacionamento;
import com.estacionamento.model.DonoCarro;
import com.estacionamento.services.EntradaEstacionamento;

public class Main {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento(100);
        DonoCarro d1 = new DonoCarro("Walace", 1999,
         "Celta", "Azul", "KHY0589", 2002);
        EntradaEstacionamento entrada = new EntradaEstacionamento(estacionamento, d1);

        
        estacionamento.status();

    } 
}