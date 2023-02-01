package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Conteudo curso1 = new Curso("Curso Java", "Curso Dio Java", 8);
		
		System.out.println(curso1);
		
		Conteudo curso2 = new Curso("Curso NodeJs", "Curso Dio NodeJs", 8);
		
		System.out.println(curso2);
				
		Conteudo mentoria1 = new Mentoria("Mentoria Java", "Mentoria Dio Java", LocalDate.now());
		
		System.out.println(mentoria1);
		
		Conteudo mentoria2 = new Mentoria("Mentoria NodeJs", "Mentoria Dio NodeJs", LocalDate.now());
		
		System.out.println(mentoria2);
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Bootcamp completo de Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev dev1 = new Dev();
		dev1.setNome("Marco");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("================================================================================");
		System.out.println("Conteúdos inscritos de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
		dev1.progredir();
		System.out.println("Conteúdos inscritos de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
		System.out.println("Conteúdos concluídos de " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
		System.out.println("Total XP: " + dev1.calcularTotalXP());
		
		Dev dev2 = new Dev();
		dev2.setNome("Aurelio");
		dev2.inscreverBootcamp(bootcamp);

		System.out.println("================================================================================");
		System.out.println("Conteúdos inscritos " + dev2.getNome() + ": "+ dev2.getConteudosInscritos());
		dev2.progredir();
		System.out.println("Conteúdos inscritos " + dev2.getNome() + ": "+ dev2.getConteudosInscritos());
		System.out.println("Conteúdos concluídos de " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
		System.out.println("Total XP: " + dev2.calcularTotalXP());

		System.out.println("================================================================================");
		System.out.println("Conteúdos inscritos de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
		dev1.progredir();
		System.out.println("Conteúdos inscritos de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
		System.out.println("Conteúdos concluídos de " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
		System.out.println("Total XP: " + dev1.calcularTotalXP());
	
		System.out.println("================================================================================");
		System.out.println("Conteúdos inscritos " + dev2.getNome() + ": "+ dev2.getConteudosInscritos());
		dev2.progredir();
		System.out.println("Conteúdos inscritos " + dev2.getNome() + ": "+ dev2.getConteudosInscritos());
		System.out.println("Conteúdos concluídos de " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
		System.out.println("Total XP: " + dev2.calcularTotalXP());

	}

}
