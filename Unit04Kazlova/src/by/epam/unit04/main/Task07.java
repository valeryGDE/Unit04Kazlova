package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
//		Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

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
		System.out.println("Числа, стоящие на диагонали:");

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%4d]", mas[i][i]);
		}
		System.out.println();
	}

}
