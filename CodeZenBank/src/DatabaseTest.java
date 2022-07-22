

public class DatabaseTest {

	public static void main(String[] args) {
		
		Customer lucas = new Customer();
		
		//lucas.name = "Lucas Aragão";
		//lucas.cellphoneNumber = "(99) 99999-9999";
		//lucas.cpf = "999.999.999-99";
		//lucas.job = "QA Inter";
		
		lucas.setName("Lucas Aragao");
		lucas.setCellphoneNumber("(99) 99999-9999");
		lucas.setCpf("999.999.999-99");
		lucas.setJob("QA Inter");
		
		Account lucasAccount = new Account();
		
		lucasAccount.deposit(100);
		
		lucasAccount.setCardHolder(lucas);
		
		System.out.println(lucasAccount.getCardHolder().getName());

	}
	
}
