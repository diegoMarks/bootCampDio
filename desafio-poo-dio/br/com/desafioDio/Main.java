package br.com.desafioDio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso(8, "Curso Java", "Descrição curso Java");
		
		Curso curso2 = new Curso(4,"Curso JS","Descrição curso JS");
		
		Mentoria mentoria = new Mentoria(LocalDate.now(), "Mentoria de Java", "Descrição mentoria Java");
		
		Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer","Descrição: Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devDiego = new Dev("Diego");
		devDiego.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos do Diego: "+devDiego.getConteudoInscrito());
		devDiego.progredir();
		System.out.println("*");
		System.out.println("Conteúdos Inscritos do Diego: "+devDiego.getConteudoInscrito());
		System.out.println("Conteúdos Concluídos do Diego: "+devDiego.getConteudosConcluidos());
		System.out.println("XP: "+devDiego.calcularTotalXp());
		
		System.out.println("");
		System.out.println("");
		Dev devAngelica = new Dev("Angélica");
		devAngelica.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos da Angélica: "+devAngelica.getConteudoInscrito());
		devAngelica.progredir();
		devAngelica.progredir();
		System.out.println("*");
		System.out.println("Conteúdos Inscritos da Angélica: "+devAngelica.getConteudoInscrito());
		System.out.println("Conteúdos Concluídos da Angélica: "+devAngelica.getConteudosConcluidos());
		System.out.println("XP: "+devAngelica.calcularTotalXp());
	}

}
