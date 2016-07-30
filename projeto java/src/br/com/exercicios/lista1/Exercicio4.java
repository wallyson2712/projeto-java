package br.com.exercicios.lista1;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Exercicio4 ext4 = new Exercicio4();
		
		System.out.println("Digite o seu nome e sua idade");
		String nome = s.nextLine();
		int idade = s.nextInt();
		
		System.out.println(""+nome+"você viveu: "+ext4.idadeDias(idade));
				
	}
	
	int idadeDias(int idade){
		
		return idade*365;
	}

}
