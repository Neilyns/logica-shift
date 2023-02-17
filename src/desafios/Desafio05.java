package desafios;

import java.util.Scanner;

public class Desafio05 {

	public static void main(String[] args) {
		//Crie um programa em Java que capture notas de alunos (um a um) e imprima a nota média
		Scanner sc = new Scanner(System.in);
		
		byte totalAlunos = 0;
		float nota = 0;
		double media = 0;
				
		System.out.println("Informe o total de alunos da sala: ");
		totalAlunos = sc.nextByte();
		
		for (int i = 1; i <= totalAlunos; i++) {
			System.out.printf("Nota aluno %d :\n", i);
			nota += sc.nextFloat();
		
		}
		media = (nota / totalAlunos);
		
		System.out.printf("A média de notas da sala é: %.2f", media);
		
		sc.close();

	}

}
