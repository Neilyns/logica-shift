package conteudos;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		int i = 100;

		do {
			System.out.println(i);
			i++;
		} while (i <= 100);
		
		Scanner sc = new Scanner(System.in);
		
		int cadastro;
		
		do {
			System.out.println("Deseja cadastrar um novo usuário? 1-Sim 2-Não");
			cadastro = sc.nextInt();
		} while (cadastro == 1);
		
		System.out.println("Encerrando o programa.");
		sc.close();

	}

}
