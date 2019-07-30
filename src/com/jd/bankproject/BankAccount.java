package com.jd.bankproject;

import java.util.Random;

public class BankAccount {

	// USERS SHOULD NOT BE ABLE TO SET ANY OF THE ATTRIBUTES FROM THE CLASS

	// String account number
	private String accountNumber;

	// double checkingBalance
	private double checkingsBalance;

	// double savingsBalance
	private double savingsBalance;

	// static class member #of accounts created this far
	private static int numberOfAccounts = 0;
	private static int totalMoney = 0;

	// Constructor - call (setAccountNumber) to give new user account
	// increase the count of account count
	public BankAccount() {
		this.checkingsBalance = 0.0;
		this.savingsBalance = 0.0;
		numberOfAccounts++;
		this.accountNumber = setAccountNumber();
	}

	// private method (setAccountNumber) that returns a random ten digit account
	// number
	private String setAccountNumber() {
		Random rnd = new Random();
		int number = rnd.nextInt(999999);
		accountNumber = String.format("%10d", number);
		return accountNumber;
	}

	// private member method to count the number of Bank Accounts
	public static void countAccounts() {
		System.out.println(numberOfAccounts);

	}

	// private member method to count the total money in all accounts
	public static void countMoney(double newMoney) {
		totalMoney += newMoney;
	}

	// Getter to get the user's checking account balance
	public double checkingsBalance() {
		return this.checkingsBalance;
	}

	// Getter to get the user's saving account balance
	public double savingsBalance() {
		return this.savingsBalance;
	}

	// method that allows users to deposit money into either the checking or saving
	// add to the total in the account that receives a deposit

	public void deposit(String account, int amount) {
		if (account.equals("checkings")) {
			if (amount > 0) {
				this.checkingsBalance += amount;
				this.checkingsBalance();
				countMoney(amount);
			}
		}
		if (account.equals("savings")) {
			if (amount > 0) {
				this.savingsBalance += amount;
				this.savingsBalance();
				countMoney(amount);
			}
		}
	}

	// method to withdraw money
	// do not allow them to withdraw money if there are insufficient funds
	public void withdraw(String account, int amount) {
		if (account.equals("checkings")) {
			if (this.checkingsBalance > amount) {
				this.checkingsBalance -= amount;
				this.checkingsBalance();
				countMoney(amount * (-1));
			}
		}
		if (account.equals("savings")) {
			if (this.savingsBalance > amount) {
				this.savingsBalance -= amount;
				this.savingsBalance();
				countMoney(amount * (-1));
			}
		}

	}

	// method to see the total money from the checking and saving
	public static void totalMoney() {
		System.out.println(totalMoney);
	}

}
