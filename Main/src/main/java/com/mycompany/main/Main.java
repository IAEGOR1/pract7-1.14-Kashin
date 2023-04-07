/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 7 (1.14), Вариант 3, Кашин Егор Ильич, РИБО-04-21");
        System.out.print("Введите числовую последовательность через запятую: ");
        String input = scanner.nextLine();
        String[] numbers = input.split(",");

        int[] values = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            values[i] = Integer.parseInt(numbers[i]);
        }

        MaxValueThread maxValueThread = new MaxValueThread(values);
        MinValueThread minValueThread = new MinValueThread(values);

        maxValueThread.start();
        minValueThread.start();

        maxValueThread.join();
        minValueThread.join();

        System.out.println("Максимальное значение: " + maxValueThread.getMaxValue());
        System.out.println("Минимальное значение: " + minValueThread.getMinValue());
    }
}