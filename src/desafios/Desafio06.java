package desafios;

import java.util.Random;
import java.util.Scanner;

public class Desafio06 {

	public static void main(String[] args) {
		/*Incluir a quantidade máxima de tentativas utilizando vetor
		 * Utilize a classe Random para gerar um número que ficará oculto para o
		 * usuário. 
		 * Este número está entre 0 e 99. 
		 * 1. Faça um laço de repetição que solicite ao usuário digitar um número; 
		 * 2. O laço encerra quando o usuário acertar o número; 
		 * 3. Se o número do usuário for menor que o oculto, escrever:
		 * “MAIOR”, se o número do usuário for maior que o oculto, escrever: “MENOR”.
		 */

		Scanner sc = new Scanner(System.in);

		int palpite = 0;
		int contador = 0;
		
		Random rnd = new Random(); // Inicia Aleatório
		int x = rnd.nextInt(100); // Gera um número aleatório (0 – 99)

		System.out.println("""
				Olá, seja bem-vindo ao desafio 
				Sorteando um número de 0 a 99...
				Tente adivinhar!
				""");

		do {
			System.out.println("""
					Informe um número de 0 a 99
					""");
			palpite = sc.nextInt();
			contador ++;
			
			if (palpite < x) {
				System.out.printf("""
						Tentativa %d: O número informado é MENOR que o número secreto.
						Tente novamente.
						
						""",contador);
			} else if (palpite > x) {
				System.out.printf("""
						Tentativa %d: O número informado é MAIOR que o número secreto.
						Tente novamente.
						""", contador);
			}

		} while (palpite != x);

		System.out.printf("Parabéns, você acertou após %d tentativas!", contador);

		sc.close();

	}
}
