package desafios;

import java.util.Scanner;
/*
 * Crie um programa Java que; após receber a velocidade máxima da via, ele
 * comece a coletar a velocidade dos carros que passam. Para cada carro que
 * passar o programa deverá ser capaz de: Multar caso desrespeitem a velocidade
 * máxima conforme os parâmetros abaixo: 1. Informe 50 reais se estiver até
 * 10km/h acima; 2. Informe 100 reais se estiver entre 11km/h e 30km/h acima; 3.
 * Informe 300 reais se estiver acima de 31km/h acima. Gerar relatório ao final
 * do processamento com: A) Velocidade média dos veículos; B) Total de multas em
 * R$ C) Total de multas aplicadas D) Percentual de carros multados
 */


public class Desafio07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		short exit = 0, velocidadeMaxima, velocidadeAtual;
		float contador = 0, carrosMultados = 0, multaAplic = 0, percentualMultados, velocidadeMedia, velocidadeTotal = 0;
		
		System.out.println("Informe a velocidade máxima da via: ");
		velocidadeMaxima = sc.nextShort();
		
		do {
			System.out.println("\nInforme a velocidade do veículo: ");
			velocidadeAtual = sc.nextShort();
			
			contador ++;
			var velocidadeExcedente = velocidadeAtual - velocidadeMaxima;
			velocidadeTotal += velocidadeAtual;
			
			if (velocidadeExcedente > 31) {
				System.out.printf("Sua velocidade está %d km/h acima do permitido. A multa por essa infração é de R$300,00\n",
						velocidadeExcedente);
				multaAplic += 300;
				carrosMultados ++;
				
			} else if (velocidadeExcedente >= 11) {
				System.out.printf("Sua velocidade está %d km/h acima do permitido. A multa por essa infração é de R$100,00\n",
						velocidadeExcedente);
				multaAplic += 100;
				carrosMultados ++;

			} else if (velocidadeExcedente > 0 ) {
				System.out.printf("Sua velocidade está %d km/h acima do permitido. A multa por essa infração é de R$50,00\n",
						velocidadeExcedente);
				multaAplic += 50;
				carrosMultados ++;

			}else {
				System.out.println("Você está dentro do limite da via");
			}
		
			System.out.println("\nO radar continua ativo? 1-Sim 2-Não");
			exit = sc.nextByte();
			
		} while(exit!=2); 
		
			velocidadeMedia = velocidadeTotal/contador;
			percentualMultados = carrosMultados/contador*100;
			
			System.out.println("*".repeat(20) + "RESUMO" + "*".repeat(20));
			System.out.printf("""
					
					Velocidade média dos veículos: %.0f km/h
					Valor total de multas aplicadas: R$ %,.2f
					Total de multas aplicadas: %.0f
					Percentual de carros multados: %.2f%%
					""",velocidadeMedia, multaAplic, carrosMultados,percentualMultados);
		
		
		sc.close();

	}
}
