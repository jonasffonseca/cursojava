package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Exercicio_Estatico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		double result = CurrencyConverter.dollarToreal(amount, dollarPrice);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);

		sc.close();
	}

}
