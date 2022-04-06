package ro.ase.cts.g1099.assignment2.models;

public class Broker {
	private static int temp = 365;
	private static double brokerFee = .0125f;
	
	public static double calculateTotalBrokerFee(BankAccount[] accounts) {
		double totalFee = 0.0;
		BankAccount account;
		//int temp = 365;
		for (int i = 0; i < accounts.length; i++) {
			account = accounts[i];
			if (account.accountType == BankAccountType.PREMIUM || account.accountType == BankAccountType.SUPER_PREMIUM) 
				totalFee += brokerFee * account.loanValueInRON * (Math.pow(account.accountRate, (account.daysActive / 365)-1));// interest-principal
		}
		return totalFee;
	}
}
