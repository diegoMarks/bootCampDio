package br.com.desafioDio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	//Atributo para data
	private LocalDate data;
	//Construtor que obriga quem instancia o objeto Mentoria a preencher os atributos
	public Mentoria(LocalDate data, String titulo, String descricao) {
		this.data = data;
		super.setTitulo(titulo);
		super.setDescricao(descricao);
	}
	//metodo de calculo de XP sobrescrito
	@Override
	public double calcularXp() {
		return XP_PADRAO + 20;
	}
	//metodo para capturar a data
	public LocalDate getData() {
		return data;
	}
	//metodo para imprimir os atributos do objeto
	@Override
	public String toString() {
		return "Mentoria [data=" + data + ", Xp = " + calcularXp() + ", getTitulo()=" + getTitulo()
				+ ", getDescricao()=" + getDescricao() + "]";
	}	
}
