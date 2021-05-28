package by.epam.unit04.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {
//	Реализовать алгоритм сортировки вставками.

		int[] mas;
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число - длину массива: ");
		n = sc.nextInt();
		mas = new int[n];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(10);
			System.out.println("mas[" + i + "]= " + mas[i]);
		}

		int temp;
		for (int i = 1; i < mas.length; i++) {
			temp = mas[i];
			int j = i - 1;
			while (j >= 0 && mas[j] > temp) {
				mas[j + 1] = mas[j];
				j = j - 1;
			}

			mas[j + 1] = temp;

		}

		System.out.println("mas sorted = " + Arrays.toString(mas));
	}

}
