package com.locadora.modelo;

import java.util.ArrayList;
import java.util.List;

public class Locadora {
    //* razao social cnpj nome fantasia funcionarios clientes carros *//
    /* gerenciar aluguel carros, gerenciar funcionarios, verificar clientes */
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private Localizacao localizacao;
    private List<Veiculo> veiculos = new ArrayList<Veiculo>();
    
    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }
    
    public void exibirVeiculos() {
    	System.out.println("Veiculos da locadora "+nomeFantasia);
    	for(Veiculo v:veiculos) {
    		System.out.println(v.getModelo());
    	}
    	if(veiculos.isEmpty())
    		System.out.println("Sem veiculos cadastrados");
    }
    
    public void removerVeiculo(int id) {
    	int index =0;
    	for(Veiculo v:veiculos) {
    		if(v.getId() == id) {
    			System.out.println("removendo veiculo de id " + id);
    			veiculos.remove(index);
    			break;
    		}
    		index++;
    	}
    }
    
    public void cadastrarVeiculo(Veiculo veiculo) {
    	veiculos.add(veiculo);
    }
    
}
