package praticaIntegradora;

import java.math.*;

public class praticaIntegradora {

	public static void main(String[] args) {
		// Avaliação de notas e frequencia (estatico - notas inseridas manualmente)
		
		double nota1, nota2, nota3, nota4, freq, total;
		String nomeDoAluno;
		char statusdoAluno;
		boolean aprovado;

		nomeDoAluno = "Ana Paula da Silva Couto";
		statusdoAluno = 'M'; //matriculada
		nota1 = 20;
		nota2 = 20;
		nota3 = 30;
		nota4 = 5;
		
		freq = 0.60;
		total = nota1 + nota2 + nota3 + nota4;
		aprovado = total >= 70 && freq >= 0.75;
		System.out.printf("O(a) aluno(a) %s obteve nota final %.2f e frequência de %.2f%%. A situação do(a) aluno(a) é: %c.\n"
				+ "Aluno aprovado? %b", nomeDoAluno, total, freq*100, statusdoAluno, aprovado);
		
	}

}
//%% = %porcentagem