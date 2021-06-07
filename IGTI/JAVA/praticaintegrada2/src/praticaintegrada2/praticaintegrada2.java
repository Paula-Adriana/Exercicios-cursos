package praticaintegrada2;

import java.util.*;

public class praticaintegrada2 {

	public static void main(String[] args) {
		// Programa que lê diversos números e toma várias decisões
		Scanner entCaractere = new Scanner(System.in);
		Scanner entNumero = new Scanner(System.in);
		char operacao = ' ';
		int[] numeros = new int[1000]; 
		int i = 0, somatorio = 0, contPares = 0;
		double media = 0;
		
		do {
			System.out.println("Menu de opções.\n"
								+ "D - para digitar novos números.\n"
								+ "Z - para apresentar o somatório dos números.\n"
								+ "V - para visualizar todos os números digitados.\n"
								+ "P - para quantidade de números digitados.\n"
								+ "M - para média simples dos números digitados.\n"
								+ "Q - para quantidade de pares.\n"
								+ "S - para sair do programa.\n");
			
			operacao = entCaractere.nextLine().charAt(0);
			switch (operacao) {
			case 'D':
				System.out.println("Digite o número desejado: ");
				numeros[i] = entNumero.nextInt();
				i++;
				break;
			case 'Z':
				for (int j = 0; j < i; j++) {
					somatorio = somatorio + numeros[j];
				}
				System.out.printf("O somatório dos números é: %d\n", somatorio);
				somatorio = 0;
				break;
			
			case 'V':
				for (int j = 0; j < i; j++) {
					System.out.printf("O número digitado foi: %d\n", numeros[j]);
				}
				break;
			case 'P':
				System.out.printf("Foram digitados : %d números.\n", i);
				break;
			case 'M':
				for (int j = 0; j < i; j++) {
					somatorio = somatorio + numeros[j];
				}
				media = somatorio / i;
				System.out.printf("A média é: %.2f.\n", media);
				somatorio = 0;
				break;
			case 'Q': 
				for (int j = 0; j < i; j++) {
					if (numeros[j] % 2 == 0)
						contPares = contPares +1; 
				}
				System.out.printf("Quantidade de números pares é: %d.\n", contPares);
				break;
			case 'S':
				break;
				default:System.out.println("Opção inválida.");
			}
		} while (operacao != 'S');
		System.out.println("Fim da execução");
	}

}
