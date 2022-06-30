
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		int idade = 13;
		int QuantidadePessoas = 2;
		
		if (idade >= 18) {

			System.out.println("Você tem mais que 18 anos");
			System.out.println("Seja bem vindo");

		} else {
			
			if (QuantidadePessoas >= 2) {
				
				System.out.println("Você não é maior de 18 anos, porém, pode entrar pois está acompanhado");
				
			} else {

				System.out.println("Você tem menos que 18 anos");
			
			}
		}
	}
}
