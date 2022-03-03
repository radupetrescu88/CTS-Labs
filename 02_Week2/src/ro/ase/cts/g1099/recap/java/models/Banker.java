package ro.ase.cts.g1099.recap.java.models;

public class Banker {
	private int nextId = 1;
	private String bankName;
	public Banker(String bankName) {
		super();
		this.bankName = bankName;
	}
	
	public BankAccount openAccount(AccountType type)
	{
		String iban = bankName + nextId;
		this.nextId +=1;
		switch(type)
		{
		case CURRENT:
			return new CurrentAccount(iban);
		case SAVINGS:
			return new CurrentAccount(iban);
		default:
			throw new UnsupportedOperationException();
		}
		
	}
		
}
	
	
	
	

