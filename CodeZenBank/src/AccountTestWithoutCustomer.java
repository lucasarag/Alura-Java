

public class AccountTestWithoutCustomer {
	
	public static void main(String[] args) {
		
		Account auroraAccount = new Account();
		System.out.println(auroraAccount.getBalance());
		
		auroraAccount.setCardHolder(new Customer());
		
		//auroraAccount.cardHolder.name = "Aurora";
		auroraAccount.getCardHolder().setName("Aurora");
		
		System.out.println(auroraAccount);
		System.out.println(auroraAccount.getCardHolder());
		System.out.println(auroraAccount.getCardHolder().getName());
		
	}
	
}
