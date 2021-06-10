package Aula_Encapsulamento;

public class Aula_Encapsulamento {

	public static void main(String[] args) {
		Carro c1 = new Carro(); //ao instanciar abaixo o objeto c1. poderia obter os atributos definidos na classe
								//Carro pois, a visibilidade da classe "Carro" era pública. 
								//Como está privado ele está "encapsulado" e preciso usar de métodos
								//especiais como o set(atribui valores) e o get (acessar valores) para preencher 
								//aqueles atributos.
		
		//Para gravar dados nas propriedades:
		c1.setnportas(4);
		c1.setMarca("Willys");
		c1.setModelo("Jipe 4x4");
		c1.setCavalos(70);
		
		//Para recuperar dados:
		//System.out.println(c1.getnportas());
		//Apesar da classe ser privada com os metodos especiais eu consigo
		//passar argumentos e alterar e também recuperar dados.
		
		System.out.printf("Marca: %s.\nModelo: %s.\nNúmero de portas: %d.\n"
				+ "Quantidade de cavalos: %d.\n", c1.getMarca(), c1.getModelo(), c1.getnportas(), c1.getCavalos());
		
	}

}
