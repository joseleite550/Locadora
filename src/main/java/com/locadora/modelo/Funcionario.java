
package com.locadora.modelo;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean isAtivo;
    private LocalDate contatratacao;
    private Cargo cargo;
    
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public boolean isAtivo() {
		return isAtivo;
	}
	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	public LocalDate getContatratacao() {
		return contatratacao;
	}
	public void setContatratacao(LocalDate contatratacao) {
		this.contatratacao = contatratacao;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public double calcularINSS() {
		return 0;
	}
	public double calcularIRRF() {
		return 0;
	}
	public double calcularSalarioLiquido() {
		return 0;
	}
	public double calcularBonificacao() {
		return 0;
	}
	
}
