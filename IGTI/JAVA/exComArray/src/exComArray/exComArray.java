package exComArray;

import java.util.*;

public class exComArray {

	public static void main(String[] args) {
		//int [] nome = new tipo [tamanho]
		
		int [] numeros = new int [5];
		int total = 0;
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		numeros[0] = ent.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numeros[1] = ent.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		numeros[2] = ent.nextInt();
		
		System.out.println("Digite o quarto número: ");
		numeros[3] = ent.nextInt();

		System.out.println("Digite o quinto número: ");
		numeros[4] = ent.nextInt();

		
		total = numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4];
		System.out.printf("O valor total é %d.\n", total);
				

	}

}
