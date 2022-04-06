package ro.ase.cts.g1099.assignment2.models;

import ro.ase.cts.g1099.assignment2.exceptions.NegativeLoanValueException;
import ro.ase.cts.g1099.assignment2.interfaces.Rateable;

public class BankAccount implements Rateable {
	public double loanValueInRON, accountRate;
	public int daysActive;
	public BankAccountType accountType;

	public BankAccount(double loanValueInRON, double rate, BankAccountType accountType) throws Exception {
		if (loanValueInRON < 0) {
			throw new Exception();
		} else {
			this.loanValueInRON = loanValueInRON;
		}
		this.accountRate = rate;
		this.accountType = accountType;
	}

	public double getLoanValueInRON() {

		return this.loanValueInRON;
	}

	public void printLoanValueInRON() {
		System.out.println("The loan value in RON is " + this.loanValueInRON);
	}

	public double getRate() {

		return this.accountRate;
	}

	public void printAccountRate() {
		System.out.println("The rate is " + this.accountRate);
	}

	// must have method - the lead has requested it in all classes
	public double getMonthlyRate() {
		return this.loanValueInRON * this.accountRate;
	}

	public void setLoanValue(double value) throws NegativeLoanValueException {
		if (value < 0)
			throw new NegativeLoanValueException();
		else {
			this.loanValueInRON = value;
		}
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
