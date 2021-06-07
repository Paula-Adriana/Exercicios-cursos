package pacotePrincipal;
import java.util.*;
public class principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); //system.in algo com construtores
		
		
		//aqui nao vai o system.in
		//pessoa=classe. P1=objeto, "criado" atraves do new.
		Pessoa p1 = new Pessoa(); 
		p1.nome = "Joãozinho";
		p1.idade = 19;
		p1.altura = 1.97;
		p1.peso = 105;
		System.out.printf("%s\nAno de nascimento: %d.\n", p1.imprimirDados(), p1.retornarAnoNascimento());
		
		Pessoa p2 = new Pessoa(); 
		p2.nome = "Atadolfa";
		p2.idade = 39;
		p2.altura = 1.60;
		p2.peso = 50;
		System.out.printf("%s\nAno de nascimento: %d.\n", p2.imprimirDados(), p2.retornarAnoNascimento());
	}

}
