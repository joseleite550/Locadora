package com.locadora.modelo;

import com.locadora.interfaces.IVeiculo;

public class Veiculo implements IVeiculo{
	private int id;
    private String cor;
    private String modelo;
    private String marca;
    private String ano;
    private String tipo;
    private int eixos;
    private double valor = 10;
    private double seguro;
    private boolean isDisponivel;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
    public double getValorDiaria() {
       return valor;
    }

    @Override
    public double getValorMensal() {
        return valor*30;
    }

    @Override
    public double getValorSeguro() {
        return seguro;
    }

    @Override
    public boolean isDisponivel() {
        return isDisponivel;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static void set(){
    }
    
}
