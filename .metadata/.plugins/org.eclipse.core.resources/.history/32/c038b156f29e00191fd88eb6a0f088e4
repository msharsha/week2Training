package com.sapient.pe.tutorial;

public class CurrentAccount extends BankAccount{
	
	private static final double minimumBalance = 25000;

	public CurrentAccount(Person person) {
		super(person);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Deposit(double money) {
		this.balance +=money;
	}
	@Override
	public void Withdraw(double money) {
		if(this.balance-money >= minimumBalance)
		{
			this.balance -=money;
		}
		else
		{
			System.out.println("You need to have enough balance");
		}
	}
	
}
