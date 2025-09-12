package com.locadora.modelo;

public class Moto extends Veiculo {

    @Override
    public double getValorDiaria() {
        return super.getValorDiaria()*0.5+super.getValorDiaria();
    }
}
