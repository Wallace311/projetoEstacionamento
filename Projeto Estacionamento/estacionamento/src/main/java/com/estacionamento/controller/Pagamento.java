package com.estacionamento.controller;

public class Pagamento {
    private boolean pago;

    public Pagamento(boolean pagamento){
        this.pago = pagamento = false;
    }

    public boolean isPago() {return pago;}
    public void setPago(boolean pago) {this.pago = pago;}
    
    
    public boolean realizarPagamento(){
        return this.pago = true;
    }

}
