package com.jd.bankproject;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount jameyAccount = new BankAccount();
		System.out.println(jameyAccount.checkingsBalance());
		jameyAccount.deposit("checkings", 100);
		System.out.println(jameyAccount.checkingsBalance());
		jameyAccount.deposit("savings", 100);
		System.out.println(jameyAccount.savingsBalance());
		jameyAccount.withdraw("checkings", 50);
		System.out.println(jameyAccount.checkingsBalance());
		jameyAccount.withdraw("savings", 20);
		System.out.println(jameyAccount.savingsBalance());
		BankAccount.countAccounts();
		BankAccount.totalMoney();
	}

}
