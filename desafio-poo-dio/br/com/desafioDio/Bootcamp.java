package br.com.desafioDio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	//Criação das variaveis
	private String nome;
	private String descricao;
	//constante de data usando LocalDate para instanciar a data corrente no momento
	//da instanciacao do objeto
	private final LocalDate dataInicial = LocalDate.now();
	//constante LocalDate de fim do bootcamp incrementando a data inicial + 45 dias
	private final LocalDate dataFinal = dataInicial.plusDays(45);
	//lista contendo devs inscritos, HashSet não busca os dados na ordem em que
	//foram inseridos, Set nao deixa itens duplicados serem inseridos
	private Set<Dev> devsInscritos = new HashSet<>();
	//LinkedHashSet faz a busca dos dados na ordem em que foram inseridos
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	
	//Construtor que obriga quem instancia o objeto Bootcamp a preencher os atributos
	public Bootcamp(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}

	//Metodos Get e Set dos atributos
	public String getNome() {
		return nome;
	}
	
	
	public String getDescricao() {
		return descricao;
	}
	
	
	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}
	
	
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	
	
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	
	//Separa o objeto em categorias, cada atributo é uma categoria e quando for comparar
	//os objetos da colecao com o metodo equals ele busca diretamente pelo hascode do objeto
	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataFinal, dataInicial, descricao, devsInscritos, nome);
	}
	
	//compara se ja nao existe um objeto igual dentro da colecao
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataFinal, other.dataFinal)
				&& Objects.equals(dataInicial, other.dataInicial) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devsInscritos, other.devsInscritos) && Objects.equals(nome, other.nome);
	}
}
