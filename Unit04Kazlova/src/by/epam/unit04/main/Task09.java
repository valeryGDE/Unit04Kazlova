package by.epam.unit04.main;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
//		Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

		int n;

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите четное число: ");
		n = sc.nextInt();

		int[][] mas = new int[n][n];

		for (int i = mas.length - 1, j = 0; i >= 0; i--, j++) {
			mas[i][j] = n;
			n--;
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();

	}

}
