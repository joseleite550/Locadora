package com.locadora.modelo;

public class Locadora {
    //* razao social cnpj nome fantasia funcionarios clientes carros *//
    /* gerenciar aluguel carros, gerenciar funcionarios, verificar clientes */
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private Localizacao localizacao;

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
    
}
