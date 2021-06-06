package exComArray;

import java.util.*;

public class exComArray {

	public static void main(String[] args) {
		//int [] nome = new tipo [tamanho]
		
		int [] numeros = new int [5];
		int total = 0, i = 0;
		Scanner ent = new Scanner(System.in);
		
		for (i = 0; i < 5; i++) {
			System.out.printf("Digite o %dº número: ", i+1);//i+1 para que nao apareca: digite o 0º numero
			numeros[i ] = ent.nextInt();
			total = total + numeros[i];
			System.out.printf("Total parcial: %d.\n", total);
		}
		
		
		System.out.printf("O valor total é %d.\n", total);
				

	}

}