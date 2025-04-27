package com.estacionamento.services;

import com.estacionamento.controller.Estacionamento;
import com.estacionamento.model.DonoCarro;

public class EntradaEstacionamento {
    
    
    public EntradaEstacionamento(Estacionamento estacionamento, DonoCarro donoCarro){
        donoCarro.darEntrada(estacionamento);
    }
}
