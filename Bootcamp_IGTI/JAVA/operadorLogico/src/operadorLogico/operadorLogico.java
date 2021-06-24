package operadorLogico;
import java.math.*;
public class operadorLogico {

	public static void main(String[] args) {
		// Algoritmo: Avaliação de concessão de empréstimos
		
		//Declaração
		boolean ult3EmprestQuitadosPrazo, possuiRendaComprovada, clienteDezEstrelas, restricaoCredito;
		
		//Atribuição
		ult3EmprestQuitadosPrazo = true; 
		possuiRendaComprovada = false;
		clienteDezEstrelas = true;
		restricaoCredito = false;
		//o interessante é nao ter restriçao, se tiver, nao emprestarei o dinheiro. Por isso negar a restricao de credito
		
		
		boolean concederEmprestimo = (ult3EmprestQuitadosPrazo && possuiRendaComprovada || clienteDezEstrelas) && !restricaoCredito;
		System.out.printf("Empréstimo concedido? \n %b", concederEmprestimo);
		
	}

}
//&& possui precedencia!