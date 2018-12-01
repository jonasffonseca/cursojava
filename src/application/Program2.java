package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> people = new ArrayList<>();
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char option = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			if (option == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				people.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				people.add(new Company(name, anualIncome, numberEmployees));
			}
		}
		Double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (TaxPayer p : people) {
			System.out.print(p.getName() + ": $ " + String.format("%.2f", p.tax()));
			sum += p.tax();
			System.out.println();
		}
		System.out.println();
		System.out.print("TOTAL TAXES: " + String.format("%.2f", sum));

		sc.close();
	}

}
