package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student estudante = new Student();

		estudante.name = sc.nextLine();
		estudante.nota1 = sc.nextDouble();
		estudante.nota2 = sc.nextDouble();
		estudante.nota3 = sc.nextDouble();
		System.out.printf("Nota Final: %.2f%n", estudante.notafinal());
		if (estudante.notafinal() < 60.0) {
			System.out.println("Rodou");
			System.out.printf("Faltou %.2f pontos", estudante.pontosrestantes());
		}
		sc.close();
	}

}
