
public class GetAndSetTest {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.setBankCode(1337);
		System.out.println(account.getBankCode());
		
		Customer customer = new Customer();
		customer.setName("Lucas");
		
		account.setCardHolder(customer);
		
		System.out.println(account);
		System.out.println(account.getCardHolder());
		System.out.println(account.getCardHolder().getName());

		Customer cardHolder = account.getCardHolder();
		
		System.out.println(cardHolder);
		System.out.println(customer);
		System.out.println(account.getCardHolder());
	}
	
}
