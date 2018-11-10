package application;

import java.util.Scanner;

public class Exercicio_Matriz_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] mat = new int[m][n];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						int left = mat[i][j - 1];
						System.out.println("Left: " + left);
					}
					if (i > 0) {
						int up = mat[i - 1][j];
						System.out.println("UP: " + up);
					}
					if (j < mat[i].length - 1) {
						System.out.println(mat[i].length - 1);
						int right = mat[i][j + 1];
						System.out.println("Right: " + right);
					}
					if (i < mat.length - 1) {
						System.out.println(mat.length - 1);
						int down = mat[i + 1][j];
						System.out.println("Down: " + down);
					}
					System.out.println();
				}
			}
		}

		sc.close();

	}

}
