package operadorLogico;
import java.math.*;
public class operadorLogico {

	public static void main(String[] args) {
		// Algoritmo: Avalia��o de concess�o de empr�stimos
		
		//Declara��o
		boolean ult3EmprestQuitadosPrazo, possuiRendaComprovada, clienteDezEstrelas;
		
		//Atribui��o
		ult3EmprestQuitadosPrazo = false; 
		possuiRendaComprovada = false;
		clienteDezEstrelas = true;
		
		
		boolean concederEmprestimo = ult3EmprestQuitadosPrazo && possuiRendaComprovada || clienteDezEstrelas;
		System.out.printf("Empr�stimo concedido? \n %b", concederEmprestimo);
		
	}

}
//&& possui precedencia!