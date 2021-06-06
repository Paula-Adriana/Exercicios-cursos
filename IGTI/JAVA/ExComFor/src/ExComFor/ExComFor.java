package ExComFor;

public class ExComFor {

	public static void main(String[] args) {
		//Trabalhando com For dentro de For
		
		int i = 0, j = 0, z = 0;
		System.out.println("Início. Não vai repetir.");
		for (i = 0; i <5; i++) {
			System.out.printf("Valor de i: %d \n", i);
			for (j = 0; j <3; j++) {
				System.out.printf("		Valor de j: %d \n", j);
				for (z = 0; z <2; z++) {
					System.out.printf("			Valor de z: %d \n", z);
					}
			}
		}
	}
}	
				
//assim fica o looping, observar como os laços são feitos!!!!!
	


