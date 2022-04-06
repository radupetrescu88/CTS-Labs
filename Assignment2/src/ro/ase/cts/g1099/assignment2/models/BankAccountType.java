package ro.ase.cts.g1099.assignment2.models;

public enum BankAccountType {
	STANDARD(0), BUDGET(1), PREMIUM(2), SUPER_PREMIUM(3);
	
	int type;
	
	
	private BankAccountType(int type)
	{
		this.type = type;
	}

}
