package com.app.projeto;

import java.util.Scanner;

import com.locadora.fabrica.VeiculoFactory;
import com.locadora.modelo.Locadora;
import com.locadora.modelo.Veiculo;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {
    	  Locadora loc = new Locadora();
          Scanner sc = new Scanner(System.in);
          loc.exibirVeiculos();
          System.out.println("Digite 1 para carro e 2 para moto para iniciar o cadastro");

          Veiculo veic = VeiculoFactory.getVeiculo(2);

          veic.setId(1234);
          veic.setModelo("teste 1");
          loc.cadastrarVeiculo(veic);
          loc.exibirVeiculos();
          
          Veiculo veic2 = VeiculoFactory.getVeiculo(2);
          veic2.setId(123456);
          veic2.setModelo("teste 2");
          loc.exibirVeiculos();
          loc.cadastrarVeiculo(veic2);
          loc.exibirVeiculos();
          
          loc.removerVeiculo(1234);
          
          loc.exibirVeiculos();
    }
}
