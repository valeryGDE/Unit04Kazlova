package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
//		Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа.

		int[] mas;
		int n;
		int length;

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число - длину массива: ");
		n = sc.nextInt();
		mas = new int[n];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
			if (rand.nextInt(100) % 3 == 0) {
				mas[i] = -mas[i];
			}
			System.out.println("mas[" + i + "]= " + mas[i]);
		}

		int min = mas[0];
		int max = mas[0];

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] < min) {
				min = mas[i];
			} else if (mas[i] > max) {
				max = mas[i];
			}

		}

		System.out.println("min = " + min + " and max = " + max);

		length = max - min;
		System.out.println("length = " + length);

	}

}
