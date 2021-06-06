package exDoWhile;

import java.util.*;

public class exDoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char continuar = ' ';
		System.out.println("Deseja Continuar (S - Sim; N - Não)?");
		continuar = entrada.nextLine().charAt(0);
		
	/*	while (continuar == 'S') {
			System.out.println("Mensagem: ");
			System.out.println("Deseja Continuar (s - sim; n - não)?");
			continuar = entrada.nextLine().charAt(0);

		}
	*/	do {
			System.out.println("Mensagem: ");
			System.out.println("Deseja Continuar (S - Sim; N - Não)?");
			continuar = entrada.nextLine().charAt(0);
		} while (continuar == 'S');

}
}
