package desafios;

import java.util.Scanner;

public class Desafio01 {
	public static void main(String[] args) {
		/*
		 Crie um programa Java que leia a velocidade de um carro e a velocidade máxima para a via: 
		 1. Informe 50 reais se estiver até 10km/h acima; 
		 2. Informe 100 reais se estiver entre 11km/h e 30km/h acima; 
		 3. Informe 300 reais se estiver acima de 31km/h acima.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a velocidade atual: ");
		short velocidadeAtual = sc.nextShort();

		System.out.println("Informe a velocidade máxima da via: ");
		short velocidadeMaxima = sc.nextShort();

		var velocidadeExcedente = velocidadeAtual - velocidadeMaxima;

		if (velocidadeExcedente > 31) {
			System.out.printf("Sua velocidade está %d km/h acima do permitido. A multa por essa infração é de R$300,00",
					velocidadeExcedente);
			
		} else if (velocidadeExcedente >= 11) {
			System.out.printf("Sua velocidade está %d km/h acima do permitido. A multa por essa infração é de R$100,00",
					velocidadeExcedente);

		} else if (velocidadeExcedente > 0 ) {
			System.out.printf("Sua velocidade está %d km/h acima do permitido. A multa por essa infração é de R$50,00",
					velocidadeExcedente);

		}else {
			System.out.println("Você está dentro do limite da via");
		}
	
		sc.close();
	}
}
