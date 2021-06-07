package trabalhoPratico2;

import java.util.*;

public class trabalhoPratico2 {

	public static void main(String[] args) {
	//Calcula o valor3 com base no valor digitado e na condicao if/else
		int valor1 = 0, valor2 = 75, valor3 = 0;
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro para a variável valor1: ");
		valor1 = ent.nextInt();
		valor2 += valor1;
		 
		if (valor1 % 2 == 0)
			valor3 = valor1 * 5;
		else if (valor1 % 3 == 0)
			valor3 = valor2 * 9;
		else
			valor3 = valor2;
		System.out.printf("O valor da variável valor 3 é: %d.", valor3);
		
		
	}

}
