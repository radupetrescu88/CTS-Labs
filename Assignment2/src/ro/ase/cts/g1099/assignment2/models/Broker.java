package ro.ase.cts.g1099.assignment2.models;

public class Broker {
	private static int temp = 365;
	private static double brokerFee = .0125f;
	
	public static double calculateTotalBrokerFee(BankAccount[] accounts) {
		double totalFee = 0.0;
		//int temp = 365;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].accountType == BankAccountType.PREMIUM || accounts[i].accountType == BankAccountType.SUPER_PREMIUM) 
				totalFee += brokerFee * accounts[i].loanValueInRON * (Math.pow(accounts[i].accountRate, (accounts[i].daysActive / 365)-1));// interest-principal
		}
		return totalFee;
	}
}
