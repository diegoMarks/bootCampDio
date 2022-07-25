package br.com.desafioDio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descrição curso JS");
		curso2.setCargaHoraria(4);

		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
		
		/*
		 * System.out.println(curso1); System.out.println(curso2);
		 * System.out.println(mentoria);
		 */
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição: Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		
		Dev devDiego = new Dev();
		devDiego.setNome("Diego");
		devDiego.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos do Diego: "+devDiego.getConteudoInscrito());
		devDiego.progredir();
		System.out.println("*");
		System.out.println("Conteúdos Inscritos do Diego: "+devDiego.getConteudoInscrito());
		System.out.println("Conteúdos Concluídos do Diego: "+devDiego.getConteudosConcluidos());
		System.out.println("XP: "+devDiego.calcularTotalXp());
		
		System.out.println("");
		System.out.println("");
		Dev devAngelica = new Dev();
		devAngelica.setNome("Angélica");
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
