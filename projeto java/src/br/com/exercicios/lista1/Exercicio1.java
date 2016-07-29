package br.com.exercicios.lista1;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String...args){
		
		int base,altura;
		Exercicio1 ex1 = new Exercicio1();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o lado maior");		
		base = s.nextInt();
		
		System.out.println("Digite o lado menor");		
		altura = s.nextInt();
		
		System.out.println("O valor da área é: "+ ex1.areaRetangulo(base, altura));
		
		
	}
	
	//calculando a area do retangulo
	int areaRetangulo(int base, int altura){
		
		int resultado = base*altura;	
	
		return resultado;
	}

}
