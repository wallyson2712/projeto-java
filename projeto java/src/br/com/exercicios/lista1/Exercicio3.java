package br.com.exercicios.lista1;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String...args){
		
		Scanner s = new Scanner(System.in);
		Exercicio3 ex3 = new Exercicio3();
		
		
		System.out.println("Digite a quantidade de pães");
		int paes = s.nextInt();
		
		System.out.println("Digite a quantidade de broas");
		int broas = s.nextInt();
		
		System.out.println("O valor vendido no dia de Hoje é:"+ ex3.valorArrecadado(paes, broas));
		
		System.out.println("Valor a ser colocado na poupança: "+ex3.poupanca(ex3.valorArrecadado(paes, broas)));		
	}
	
	double valorArrecadado(int paes, int broas){
		
		double total = ((paes*0.12) + (broas*1.50));
		
		return total;
		
	}
	
	double poupanca(double arrecadado){
		
		double valor = arrecadado*0.1;
		
		return valor;
	}

}
