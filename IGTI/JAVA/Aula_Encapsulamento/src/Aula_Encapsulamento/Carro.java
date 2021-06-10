package Aula_Encapsulamento;

public class Carro {
	private int nportas;
	private String marca;
	private String modelo;
	private int cavalos;
	
	//o metodo especial é sempre publico / aqui escrito manualmente
	public int getnportas() {
		return nportas;
	}
	public void setnportas(int nportas) {//set nao retorna nada por isso o "void". 
		this.nportas = nportas;			//usar a palavra reservada "this" para se referir quem é o atributo 
										//ou seja, o valor que será passado na outra classe vem pelo argumento
										//nportas e é atribuido na propriedade nportas.
	}
	//Eclipse gera automatico esses metodos especiais (botao direito no codigo; source: generate get and setters
	//pois é muito trabalhoso fazer esses metodos para cada atributo/propriedade
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCavalos() {
		return cavalos;
	}
	public void setCavalos(int cavalos) {
		this.cavalos = cavalos;
	}
	
}//Se fizer somente o metodo get o arquivo fica como "somente leitura". Pois a pessoa nao conseguirá atribuir
//nada com o set. pois o metodo nao foi escrito. 
