package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exeptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			sc.nextLine();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			Account acc = new Account(number, holder, balance, withdrawLimit);
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			Double withdrawAmmount = sc.nextDouble();
			acc.withdraw(withdrawAmmount);
			System.out.print("New balance: " + String.format("%.2f", acc.getBalance()));
		} catch (DomainException e) {
			System.out.println("Withdraw Error: " + e.getMessage());
		}
		sc.close();
	}

}
