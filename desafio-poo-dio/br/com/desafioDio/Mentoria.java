package br.com.desafioDio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	
	private LocalDate data;
	
	public Mentoria() {
		super();
	}
	
	@Override
	public double calcularXp() {
		return XP_PADRAO + 20;
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [data=" + data + ", Xp = " + calcularXp() + ", getTitulo()=" + getTitulo()
				+ ", getDescricao()=" + getDescricao() + "]";
	}

	
	
}
