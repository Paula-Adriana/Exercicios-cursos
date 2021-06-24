package exComSwitch;

import java.util.Scanner;

public class exComSwitch {
	
	public static void main(String[] args) {
		//Calculadora com switch
		
		char operacao = ' '; //char vazio
		double n1 = 0, n2 = 0, total = 0;
		Scanner ent = new Scanner(System.in);//o nome ent é qq nome, é o ent que vai guardar o que o usuario digitar
		
		System.out.println("Digite o primeiro número: ");
		n1 = ent.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = ent.nextInt();
		
		//Por utilizar o mesmo scanner para entrada numerica e alfabetica pode dar erro, usar o seguinte comando para limpar o buffer
		ent.nextLine();
		System.out.println("Digite a operação desejada (+,-,*,/,%): ");
		operacao = ent.nextLine().charAt(0);
		
		switch (operacao) {
			case '+':
				total = n1+n2;
				break;
			case '-':
				total = n1-n2;
				break;
			case '/':
				total = n1/n2;
				break;
			case '*':
				total = n1*n2;
				break;
			case '%':
				total = n1%n2;
				break;
			default: //default qdo nao entrou em nenhuma opcao
				System.out.println("Operação desconhecida.");
		}
		if (operacao == '+' || operacao == '-' || operacao == '*' || operacao == '/'
				|| operacao == '%')
				System.out.printf("%.2f %c %.2f = %.2f.", n1, operacao, n2, total);

	}

}
