package exBreakContinue;

import java.util.*;

public class exBreakContinue {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0, somatorio = 0;
		
		System.out.println("Digite o n�mero desejado: ");
		numero = entrada.nextInt();
		
		while (numero > 0) {
			somatorio = somatorio + numero;
			
			System.out.println("Digite o n�mero desejado: ");
			numero = entrada.nextInt();
			
			if (numero == 10) //caso o usuario digite determinado valor (ex: 10) com o break � for�ado a parar
				break;
		}
			System.out.printf("O somat�rio foi %d.", somatorio);
	}

}
