package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
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

		
	}

}
