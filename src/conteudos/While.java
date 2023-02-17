package conteudos;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		int i = 0;
		
		while (i <= 100) {
			System.out.println(i);
			i++;
			
		}
		
		Scanner sc = new Scanner(System.in);
		
		int op = 1;
		
		while (op == 1) {
			System.out.println("Deseja cadastrar um novo produto? 1-Sim 2-Não");
			op = sc.nextInt();
			
		}
		sc.close();

	}

}
