package conteudos;

public class Vetor {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at index " + i + ":" + arr[i]);
		System.out.println("Total de elementos: " + arr.length);

		// também pode ser escrito dessa forma:
		int[] tipo0;
		int tipo1[];
		int[] tipo2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] tipo3 = new int[9];
		
		int[] a = new int[99999999];
		int[] b = new int[a.length];
		
		//Copiando conteúdo de um array
		
		for (int i = 0; i < arr.length; i++) b[i] = a[i];
		
		b = a.clone();
	}

}
