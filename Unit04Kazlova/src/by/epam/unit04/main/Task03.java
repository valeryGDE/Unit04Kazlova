package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
//		Дан массив действительных чисел, размерность которого N. 
//		Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

		int[] mas;
		int n;

		int zeroCounter = 0;
		int positiveCounter = 0;
		int negativeCounter = 0;

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

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] == 0) {
				zeroCounter++;
			} else if (mas[i] > 0) {
				positiveCounter++;
			} else if (mas[i] < 0) {
				negativeCounter++;
			}

		}
		System.out.println(
				"zero = " + zeroCounter + " and positive = " + positiveCounter + " and negative = " + negativeCounter);
	}

}
