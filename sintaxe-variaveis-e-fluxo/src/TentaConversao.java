
public class TentaConversao {

	public static void main(String[] args) {
		
		double salario = 1270.50;
		
		float pontoFlutuante = 3.14f;
		System.out.println(pontoFlutuante);
		
		int valor = (int)salario;
		System.out.println(valor);
		
		// int cabe somente 32bits = 2 bilhões - 1
		int teste = 999999999;
		System.out.println(teste);
		
		// long cabe até 64bits = 2^63-1
		long numeroGrande = 999999999999999999L;
		System.out.println(numeroGrande);
		
		// short cabe somente 16bits = 32000-1 
		short numeroPequeno = 9999;
		System.out.println(numeroPequeno);
		
		//byte cabe somente 8bits = 8^8 (127)
		byte numeroByte = 127;
		System.out.println(numeroByte);
	
	}
	
}
