package exDoWhile;

import java.util.*;

public class exDoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char continuar = ' ';
		System.out.println("Deseja Continuar (S - Sim; N - N�o)?");
		continuar = entrada.nextLine().charAt(0);
		
	/*	while (continuar == 'S') {
			System.out.println("Mensagem: ");
			System.out.println("Deseja Continuar (s - sim; n - n�o)?");
			continuar = entrada.nextLine().charAt(0);

		}
	*/	do {
			System.out.println("Mensagem: ");
			System.out.println("Deseja Continuar (S - Sim; N - N�o)?");
			continuar = entrada.nextLine().charAt(0);
		} while (continuar == 'S');

}
}
