package operadorLogico;
import java.math.*;
public class operadorLogico {

	public static void main(String[] args) {
		// Algoritmo: Avalia��o de concess�o de empr�stimos
		
		//Declara��o
		boolean ult3EmprestQuitadosPrazo, possuiRendaComprovada, clienteDezEstrelas, restricaoCredito;
		
		//Atribui��o
		ult3EmprestQuitadosPrazo = true; 
		possuiRendaComprovada = false;
		clienteDezEstrelas = true;
		restricaoCredito = false;
		//o interessante � nao ter restri�ao, se tiver, nao emprestarei o dinheiro. Por isso negar a restricao de credito
		
		
		boolean concederEmprestimo = (ult3EmprestQuitadosPrazo && possuiRendaComprovada || clienteDezEstrelas) && !restricaoCredito;
		System.out.printf("Empr�stimo concedido? \n %b", concederEmprestimo);
		
	}

}
//&& possui precedencia!