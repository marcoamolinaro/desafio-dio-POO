package br.com.dio.desafio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Curso Java", "Curso Dio Java", 8);
		
		System.out.println(curso1);
		
		Curso curso2 = new Curso("Curso NodeJs", "Curso Dio NodeJs", 8);
		
		System.out.println(curso2);
				
		Mentoria mentoria1 = new Mentoria("Mentoria Java", "Mentoria Dio Java", LocalDate.now());
		
		System.out.println(mentoria1);
		
		Mentoria mentoria2 = new Mentoria("Mentoria NodeJs", "Mentoria Dio NodeJs", LocalDate.now());
		
		System.out.println(mentoria2);

		
	}

}
