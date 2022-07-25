package br.com.desafioDio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	
	private String nome;
	private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	

	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudoInscrito.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudosConcluidos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudoInscrito.remove(conteudo.get());
		} else {
			System.err.println("Você não está matrículado em nenhum conteúdo!");
		}
	}
	
	public double calcularTotalXp() {
		return this.conteudosConcluidos
				.stream()
				.mapToDouble(conteudo -> conteudo.calcularXp())
				.sum();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudoInscrito() {
		return conteudoInscrito;
	}

	public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
		this.conteudoInscrito = conteudoInscrito;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudoInscrito, conteudosConcluidos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudoInscrito, other.conteudoInscrito)
				&& Objects.equals(conteudosConcluidos, other.conteudosConcluidos) && Objects.equals(nome, other.nome);
	}
}
