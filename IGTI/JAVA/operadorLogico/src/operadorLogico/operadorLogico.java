package operadorLogico;
import java.math.*;
public class operadorLogico {

	public static void main(String[] args) {
		// Algoritmo: Avaliação de concessão de empréstimos
		
		//Declaração
		boolean ult3EmprestQuitadosPrazo, possuiRendaComprovada, clienteDezEstrelas;
		
		//Atribuição
		ult3EmprestQuitadosPrazo = false; 
		possuiRendaComprovada = false;
		clienteDezEstrelas = true;
		
		
		boolean concederEmprestimo = ult3EmprestQuitadosPrazo && possuiRendaComprovada || clienteDezEstrelas;
		System.out.printf("Empréstimo concedido? \n %b", concederEmprestimo);
		
	}

}
//&& possui precedencia!