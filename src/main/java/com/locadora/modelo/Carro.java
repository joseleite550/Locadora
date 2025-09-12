package com.locadora.modelo;


public class Carro extends Veiculo {

    @Override
    public double getValorDiaria() {
        return super.getValorDiaria()*0.1+super.getValorDiaria();
    }
    
    
}
