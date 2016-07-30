package br.com.exercicios.lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main (String...args){
		
		Scanner s = new Scanner(System.in);
		Exercicio2 ex2 = new Exercicio2();
		
		System.out.println("Digite de número de cavalos");
		int cavalos = s.nextInt();
		
		System.out.println("Número de ferraduras: "+ ex2.calcularFerraduras(cavalos));
		
	}
	
	int calcularFerraduras(int cavalos){
		
		return cavalos*4;
	}
}
