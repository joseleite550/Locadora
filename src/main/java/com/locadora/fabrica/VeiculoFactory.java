package com.locadora.fabrica;

import com.locadora.modelo.Carro;
import com.locadora.modelo.Moto;
import com.locadora.modelo.Veiculo;

/**
 *
 * @author Usuario
 */
public class VeiculoFactory {
    
    public static Veiculo getVeiculo(int escolha){
        if(escolha == 1){
            return new Carro();
        }else{
            return new Moto();
        }
    }
}
