package br.com.desafioDio;

public class Curso extends Conteudo{
	
	private int cargaHoraria;
	
	public Curso() {
		super();
	}
	
	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}
	
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [cargaHoraria=" + cargaHoraria + ", Xp = " + calcularXp() + ", getTitulo()=" + getTitulo()
				+ ", getDescricao()=" + getDescricao() + "]";
	}
	
	


	
}
