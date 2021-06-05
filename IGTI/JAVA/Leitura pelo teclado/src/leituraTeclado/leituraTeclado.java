package leituraTeclado;

import java.math.*;
import java.util.*; //scanner

public class leituraTeclado {

	public static void main(String[] args) {
		
		
		double nota1, nota2, nota3, nota4, freq, total;
		char statusdoAluno;
		
		
		Scanner entradaNotas = new Scanner(System.in); //instancia do scanner
		Scanner entradaCaractere = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: ");
		String nomeDoAluno = entradaCaractere.nextLine(); //lê o nome do aluno
		
		System.out.print("Digite um caractere para a situação do aluno (O --> OK; P --> Pendência: ");
		statusdoAluno = entradaCaractere.nextLine().charAt(0); //zero para pegar somente o primeiro caractere
		
		//Entrada de notas
		System.out.print("Digite a primeira nota do aluno: ");
		nota1 = entradaNotas.nextDouble(); //nota1 recebe a entrada do teclado atraves do scanner entradaNotas
		System.out.print("Digite a segunda nota do aluno: ");
		nota2 = entradaNotas.nextDouble();
		System.out.print("Digite a terceira nota do aluno: ");
		nota3 = entradaNotas.nextDouble();
		System.out.print("Digite a quarta nota do aluno: ");
		nota4 = entradaNotas.nextDouble();
		
		//Entrada de frequencia
		System.out.print("Digite a frequência do aluno: ");
		freq = entradaNotas.nextDouble();
		
		//Calculo da nota total
		total = nota1 + nota2 + nota3 + nota4;
		boolean aprovado = total >= 70 && freq >= 0.75;
		
		System.out.printf("O(a) aluno(a) %s obteve nota final %.2f e frequência de %.2f%%. A situação do(a) aluno(a) é: %c.\n"
				+ "Aluno aprovado? %b.", nomeDoAluno, total, freq*100, statusdoAluno, aprovado);

	}

}
//objeto scanner: le a entrada do teclado direto na variavel
