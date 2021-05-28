package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
//		Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

		int n;
		int m;

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число - количество строк массива: ");
		n = sc.nextInt();

		System.out.print("Введите число - количество столбцов массива: ");
		m = sc.nextInt();

		int[][] mas = new int[n][m];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(1000);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}

			System.out.println();
		}

		System.out.println();

		int k = 0;
		int p = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == mas[i][p]) {
					System.out.printf("[%4d]", mas[i][j]);
				} else if (mas[i][j] == mas[k][j]) {
					System.out.printf("[%4d]", mas[i][j]);
				} else {
					System.out.printf("      ");
				}
			}

			System.out.println();
		}

	}

}
