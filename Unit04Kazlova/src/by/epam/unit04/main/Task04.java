package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
//		Реализовать сортировки выбором или пузырьком по убыванию.

		int[] mas;
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число - длину массива: ");
		n = sc.nextInt();
		mas = new int[n];

		Random rand = new Random();

		System.out.print("Оригинальный массив:  ");
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
			System.out.printf("%4d ", mas[i]);
		}

		System.out.println();

		// сортировка выбором

		int max;
		int temp;

		for (int i = 0; i < mas.length - 1; i++) {
			max = i;

			for (int j = i + 1; j < mas.length; j++) {
				if (mas[j] > mas[max]) {
					max = j;
				}
			}

			temp = mas[i];
			mas[i] = mas[max];
			mas[max] = temp;
		}

		System.out.print("Сортировка выбором:   ");
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%4d ", mas[i]);
		}

		System.out.println();

		// сортировка пузырьком

		boolean sorted = false;
		int temp2;
		while (!sorted) {
			sorted = true;

			for (int i = 0; i < mas.length - 1; i++) {
				if (mas[i] < mas[i + 1]) {
					temp2 = mas[i];
					mas[i] = mas[i + 1];
					mas[i + 1] = temp2;
					sorted = false;
				}
			}
		}

		System.out.print("Сортировка пузырьком: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%4d ", mas[i]);
		}

	}

}
