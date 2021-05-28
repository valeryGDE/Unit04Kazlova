package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
//		Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности. 
//		Если таких чисел нет, то вывести сообщение об этом факте.

		int[] numbers;
		int[] mas;
		int n;
		int counterOfEvenNumbers = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число - длину массива: ");
		n = sc.nextInt();
		numbers = new int[n];
		mas = new int[n];

		System.out.println();
		Random rand = new Random();

		System.out.println("Оригинальный массив:");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
			System.out.println("numbers[" + i + "]= " + numbers[i]);
		}

		System.out.println();
		System.out.println("Массив четных чисел:");

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				mas[counterOfEvenNumbers] = numbers[i];

				System.out.println("mas[" + counterOfEvenNumbers + "]= " + mas[counterOfEvenNumbers]);

				counterOfEvenNumbers++;

				if (counterOfEvenNumbers == 0) {
					System.out.println("В последовательности нет четных чисел");
				}

			}

		}

	}

}