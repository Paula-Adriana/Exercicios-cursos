package principal2_OO;

public class dadosEndereco {
	
	String logradouro;
	int numero;
	String complemento;
	String cidade;
	String estado;
	String CEP;
	
	String imprimirDadosEndereco() {
		return "Rua " + logradouro + ", " + Integer.toString(numero) + ", " + complemento + ". Cidade: " +
				cidade + ". Estado: " + estado + ". CEP: " + CEP;
		
	}
}

//integer.toString = conversao para string pois o metodo está retornando uma string