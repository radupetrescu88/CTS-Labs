package ro.ase.cts.g1099.assignment2.models;

public class Account {
	public double loanValueInRON, accountRate;
	public int daysActive, accountType;
	public static final int STANDARD = 0, BUDGET = 1, PREMIUM = 2, SUPER_PREMIUM = 3;

	public Account(double loanValueInRON, double rate, int accountType) throws Exception {
		if (loanValueInRON < 0) {
			throw new Exception();
		} else {
			this.loanValueInRON = loanValueInRON;
		}
		this.accountRate = rate;
		this.accountType = accountType;
	}

	public double getLoanValueInRON() {
		System.out.println("The loan value in RON is " + this.loanValueInRON);
		return loanValueInRON;
	}

	public double getRate() {
		System.out.println("The rate is " + accountRate);
		return this.accountRate;
	}

	// must have method - the lead has requested it in all classes
	public double getMonthlyRate() {
		return loanValueInRON * accountRate;
	}

	public void setLoanValue(double value) throws Exception {
		if (value < 0)
			throw new Exception();
		else {
			loanValueInRON = value;
		}
	}

	public static double calculateBrokerFee(Account[] accounts) {
		double totalFee = 0.0;
		Account account;
		//int temp = 365;
		for (int i = 0; i < accounts.length; i++) {
			account = accounts[i];
			if (account.accountType == Account.PREMIUM || account.accountType == Account.SUPER_PREMIUM) 
				totalFee += .0125 * account.loanValueInRON * (Math.pow(account.accountRate, (account.daysActive / 365)-1));// interest-principal
		}
		return totalFee;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [loanValueInRON=");
		builder.append(loanValueInRON);
		builder.append(", accountRate=");
		builder.append(accountRate);
		builder.append(", daysActive=");
		builder.append(daysActive);
		builder.append(", accountType=");
		builder.append(accountType);
		builder.append("]");
		return builder.toString();
	}
}
