
public class TestaCondicional2 {
	public static void main(String[] args) {
		
		System.out.println("Testando condicionais");
		
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("O valor de acompanhado é: "+acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("\nVocê tem mais de 18 anos");
			System.out.println("Seja Bem Vindo(a)!!");
			
		}
		
		else {
			System.out.println("\nInfelizmente você não pode entrar!");
		}
	}
}

