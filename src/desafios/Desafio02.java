package desafios;

import java.time.Year;
import java.util.Scanner;

public class Desafio02 {
	public static void main(String[] args) {
		/*
		  Faça um programa que escreva se um ano informado pelo usuário é bissexto ou não. 
		  Um ano é bissexto quando é (divisível por 400) ou é (divisível por 4 e não por 100).
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o ano que deseja consultar: ");
		short ano = sc.nextShort();
		boolean bissexto = Year.isLeap(ano);
		
		if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.printf("O ano %d é bissexto, possui 366 dias\n",ano);
			
		}else {
			System.out.printf("O ano %d não é bissexto, possui 365 dias\n",ano);
		}

		if(bissexto) {
			System.out.printf("O ano %d é bissexto, possui 366 dias. Return %b",ano, bissexto);
			
		}else {
			System.out.printf("O ano %d não é bissexto, possui 365 dias. Return %b",ano, bissexto);
		}
		
		sc.close();
	}

}
