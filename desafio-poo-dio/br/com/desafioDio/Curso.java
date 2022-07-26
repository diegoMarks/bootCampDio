package br.com.desafioDio;

public class Curso extends Conteudo{
	//Atributo 
	private int cargaHoraria;
	//Construtor que obriga o usuario a preencher os atributos ao instanciar
	//o objeto
	public Curso(int cargaHoraria, String titulo,String descricao) {
		this.cargaHoraria = cargaHoraria;
		super.setDescricao(descricao);
		super.setTitulo(titulo);
	}
	
	
	//metodo de calculo de xp sobrescrito
	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}
	
	//metodo Get
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	//toString sobrescrito para impressao do objeto
	@Override
	public String toString() {
		return "Curso [cargaHoraria=" + cargaHoraria + ", Xp = " + calcularXp() + ", getTitulo()=" + getTitulo()
				+ ", getDescricao()=" + getDescricao() + "]";
	}
	
	


	
}
