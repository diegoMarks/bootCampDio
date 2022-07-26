package br.com.desafioDio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	//atributos
	private String nome;
	//duas listas de conteudos, Set nao permite itens repetidos e LinkedHashSet
	//faz a busca na sequencia em que foi salvo os objetos
	private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	//Construtor que obriga quem instancia o objeto a preencher o atributo nome
	public Dev(String nome) {
		this.nome = nome;
	}


	//metodo sem retorno que recebe um bootcamp por parametro, pega o conteudo do bootcamp
	//e adiciona na lista, apos isso insere no bootcamp o dev que chamou o metodo
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudoInscrito.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}
	
	//metodo que captura o primeiro curso da lista de conteudo, se tiver algum item ele insere o item
	//na lista de conteudo concluido e apos isso ele remove esse conteudo da lista de conteudo inscrito
	//se o dev nao estiver matriculado em nenhum curso uma mensagem de erro sera aprensentada a ele.
	public void progredir() {
		Optional<Conteudo> conteudoOptional = this.conteudoInscrito.stream().findFirst();
		if(conteudoOptional.isPresent()) {
			this.conteudosConcluidos.add(conteudoOptional.get());
			this.conteudoInscrito.remove(conteudoOptional.get());
		} else {
			System.err.println("Você não está matrículado em nenhum conteúdo!");
		}
	}
	
	//Metodo que calcula XP do dev
	public double calcularTotalXp() {
		return this.conteudosConcluidos
				.stream()
				.mapToDouble(conteudo -> conteudo.calcularXp())
				.sum();
	}

	//metodos Get
	public String getNome() {
		return nome;
	}

	public Set<Conteudo> getConteudoInscrito() {
		return conteudoInscrito;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}
	
	//metodo que separa os atributos do objeto e deixa eles como se fossem setores
	@Override
	public int hashCode() {
		return Objects.hash(conteudoInscrito, conteudosConcluidos, nome);
	}
	//metodo que faz a comparacao dos itens da lista e faz a busca
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
