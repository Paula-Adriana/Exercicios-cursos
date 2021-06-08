package trabalhoPratico;

import java.util.*;

public class trabalhoPratico {
//FIGURA 06
	public static void main(String[] args) {
		// Programa multiplica n1*n2 e o resultado é o resto da divisao por 2(n3)

		Scanner entrada = new Scanner(System.in);
		double n1 = 0, n2 = 0, n3 = 2, resultado;
		
		System.out.println("Digite o valor para a variável n1: ");
		n1 = entrada.nextDouble();
		
		System.out.println("Digite o valor para a variável n2: ");
		n2 = entrada.nextDouble();
		
		resultado = n1 * n2 % n3;
		System.out.printf("O valor total é: %.2f. ", resultado);
		
		
	}

}
