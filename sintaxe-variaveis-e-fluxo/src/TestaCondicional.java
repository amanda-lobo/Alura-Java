
public class TestaCondicional {
	public static void main(String[] args) {
		
		System.out.println("Testando condicionais");
		
		int idade = 16;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("\nVoc� tem mais de 18 anos");
			System.out.println("Seja Bem Vindo(a)!!");
		}
		else {
			if(quantidadePessoas >= 2) {
				System.out.println("\nVoc� n�o tem mais de 18 anos mas pode entrar, "
						+ "pois est� acompanhado(a)!");
			}
			else {
			System.out.println("\nInfelizmente voc� n�o pode entrar!");
			}
		}
	}

}
