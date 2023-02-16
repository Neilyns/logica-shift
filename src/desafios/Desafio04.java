package desafios;

import java.util.Scanner;

public class Desafio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Olá, seja bem-vindo. \nDigite seu nome para iniciar: ");
		String nome = sc.next();

		System.out.println("""
						Selecione uma das opções: 
						 1-Elogio profissional 
						 2-Elogio físico 
						 3-Elogio pessoal """);
		
		byte opcao = sc.nextByte();

		switch (opcao) {
		case 1:
			System.out.printf(" %s, Você é responsável e dedicada.", nome);
			break;
		case 2:
			System.out.printf(" %s, Você tem um lindo sorriso.", nome);
			break;
		case 3:
			System.out.printf(" %s, Brilhante, forte e protetor(a) são as palavras que melhor te definem.", nome);
			break;
			default:
				System.out.println("Ops, você não informou um número válido para receber um elogio.");
		}

		sc.close();

	}

}
