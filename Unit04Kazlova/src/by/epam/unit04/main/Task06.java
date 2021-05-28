package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
//		Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов массива.

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
				mas[i][j] = rand.nextInt(8);
			}
		}

		int counterOfSevens = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == 7) {
					counterOfSevens++;
				}
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}

		System.out.println("Number seven occurs " + counterOfSevens + " times");

	}

}
