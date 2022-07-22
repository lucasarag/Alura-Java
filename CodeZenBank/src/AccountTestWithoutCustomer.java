

public class AccountTestWithoutCustomer {
	
	public static void main(String[] args) {
		
		Account auroraAccount = new Account();
		System.out.println(auroraAccount.balance);
		auroraAccount.cardHolder = new Customer();
		auroraAccount.cardHolder.name = "Aurora";
		System.out.println(auroraAccount);
		System.out.println(auroraAccount.cardHolder);
		System.out.println(auroraAccount.cardHolder.name);
		
		
	}
	
}
