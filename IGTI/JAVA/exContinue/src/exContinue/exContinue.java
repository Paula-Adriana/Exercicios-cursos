package exContinue;

import java.util.*;

public class exContinue {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0, somatorio = 0, contador = 0;
			
			
		do {
			System.out.println("Digite número positivos ou zero para sair.");
			numero = entrada.nextInt();
			
			if (numero == 18)
				continue; //quando é digitado 18 ele nao faz o proximo comando somatorio, ver o debug
			somatorio = somatorio + numero;
		} while (numero > 0);
		System.out.printf("O somatório é %d.", somatorio);
	}

}
