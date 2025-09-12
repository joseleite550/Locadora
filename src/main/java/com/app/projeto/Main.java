package com.app.projeto;

import com.locadora.fabrica.VeiculoFactory;
import com.locadora.modelo.Carro;
import com.locadora.modelo.Locadora;
import com.locadora.modelo.Veiculo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {
//        Locadora loc = new Locadora();
          Scanner sc = new Scanner(System.in);
//        System.out.println("Bem vindo ao sistema");
//        System.out.println("Informe os dados da locadora");
//        
//        System.out.println("Informe a razão social");
//        String razao = sc.nextLine();
//        loc.setRazaoSocial(razao);
//        
//        System.out.println("Informe o nome fantasia");
//        String fantasia = sc.nextLine();
//        loc.setNomeFantasia(fantasia);
//      
//        System.out.println("Informe o cnpj");
//        String cnpj = sc.nextLine();
//        loc.setRazaoSocial(cnpj);


          System.out.println("Digite 1 para carro e 2 para moto");
          int escolha = sc.nextInt();
          Veiculo veic = VeiculoFactory.getVeiculo(escolha);
          
          System.out.println(veic.getValorDiaria());
//       
    }
}
