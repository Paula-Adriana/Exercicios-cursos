package praticaIfElse;

import java.util.Scanner;

public class praticaIfElse {

	public static void main(String[] args) {
		
		double n1, n2, n3, total, mediaAvaliacoes, freq;
		String situacao;
		Scanner entrada = new Scanner(System.in); //recebe dados do teclado
		
		//Entada de notas
		System.out.println("Digite a primeira nota: ");
		n1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota: ");
		n2 = entrada.nextDouble();
		System.out.println("Digite a terceira nota: ");
		n3 = entrada.nextDouble();
		
		total = n1+n2+n3;
		mediaAvaliacoes = total/3;
		
		System.out.println("Digite a frequência do aluno: ");
		freq = entrada.nextDouble();
		
		if (total >= 70 && freq >= 0.75)
			situacao = "Aprovado";
		else if (total >= 40 && total < 70 && freq >= 0.75)
			situacao = "Exame especial";
		else
			situacao = "Reprovado";
		
		System.out.printf("O aluno obteve nota total %.2f e média por avalição de %.2f. A frequência foi %.2f. Com isso o aluno "
				+ "está: %s.", total, mediaAvaliacoes, freq*100, situacao);
	}

}
