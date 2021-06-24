package praticaintegrada2;

import java.util.*;

public class praticaintegrada2 {

	public static void main(String[] args) {
		// Programa que l� diversos n�meros e toma v�rias decis�es
		Scanner entCaractere = new Scanner(System.in);
		Scanner entNumero = new Scanner(System.in);
		char operacao = ' ';
		int[] numeros = new int[1000]; 
		int i = 0, somatorio = 0, contPares = 0;
		double media = 0;
		
		do {
			System.out.println("Menu de op��es.\n"
								+ "D - para digitar novos n�meros.\n"
								+ "Z - para apresentar o somat�rio dos n�meros.\n"
								+ "V - para visualizar todos os n�meros digitados.\n"
								+ "P - para quantidade de n�meros digitados.\n"
								+ "M - para m�dia simples dos n�meros digitados.\n"
								+ "Q - para quantidade de pares.\n"
								+ "S - para sair do programa.\n");
			
			operacao = entCaractere.nextLine().charAt(0);
			switch (operacao) {
			case 'D':
				System.out.println("Digite o n�mero desejado: ");
				numeros[i] = entNumero.nextInt();
				i++;
				break;
			case 'Z':
				for (int j = 0; j < i; j++) {
					somatorio = somatorio + numeros[j];
				}
				System.out.printf("O somat�rio dos n�meros �: %d\n", somatorio);
				somatorio = 0;
				break;
			
			case 'V':
				for (int j = 0; j < i; j++) {
					System.out.printf("O n�mero digitado foi: %d\n", numeros[j]);
				}
				break;
			case 'P':
				System.out.printf("Foram digitados : %d n�meros.\n", i);
				break;
			case 'M':
				for (int j = 0; j < i; j++) {
					somatorio = somatorio + numeros[j];
				}
				media = somatorio / i;
				System.out.printf("A m�dia �: %.2f.\n", media);
				somatorio = 0;
				break;
			case 'Q': 
				for (int j = 0; j < i; j++) {
					if (numeros[j] % 2 == 0)
						contPares = contPares +1; 
				}
				System.out.printf("Quantidade de n�meros pares �: %d.\n", contPares);
				break;
			case 'S':
				break;
				default:System.out.println("Op��o inv�lida.");
			}
		} while (operacao != 'S');
		System.out.println("Fim da execu��o");
	}

}
