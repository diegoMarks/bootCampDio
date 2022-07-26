package br.com.desafioDio;

//classe abstrada onde nada concreto pode ser instanciado, quem herdar dessa classe
//é obrigado a implementar seus metodos
public abstract class Conteudo {
	//atributo protected, so pode ser usado pela classe e seus filhos.
	//atributo constante indicando a quantidade de xp padrao
	protected static final double XP_PADRAO = 10d;
	//atributos comuns
	private String titulo;
	private String descricao;
	
	//metodo abstrato que obrigatoriamente sera implementado nas classes filhas
	public abstract double calcularXp();

	//metodos Get e Set, sem Set XP
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public static double getXpPadrao() {
		return XP_PADRAO;
	}
}
