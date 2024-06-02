package com.dmdev.DZ;
/*
Напишите программу на Java, которая принимает два целых
числа от пользователя, а затем печатает сумму, разницу, произведение, среднее значение, расстояние (разница между целыми числами), максимум (большее из двух целых чисел), минимум (меньшее из двух целых чисел).

Тестовые данные:
Введите 1-е целое число: 25
Введите второе целое число: 5

Ожидаемый результат:
Сумма двух целых чисел: 30
Разница двух целых чисел: 20
Произведение из двух целых чисел: 125
Среднее из двух целых чисел: 15,00
Расстояние двух целых чисел: 20
Максимальное целое число: 25
Минимальное целое число: 5
 */

import java.util.Scanner;

public class DZ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1-е целое число: ");
        int value = sc.nextInt();
        System.out.println("Введите второе целое число: ");
        int value1 = sc.nextInt();
        int sum1 = Math.addExact(value1, value);
        System.out.println("Сумма двух целых чисел: " + sum1);
        int sub = Math.subtractExact (value, value1);
        System.out.println("Разница двух целых чисел: " + sub);
        int mul = Math.multiplyExact(value, value1);
        System.out.println("Произведение из двух целых чисел:" + mul );
        int aver = (value + value1) / 2;
        System.out.println("Среднее из двух целых чисел: " + aver);
        int dist = Math.abs(value - value1);
        System.out.println("Расстояние двух целых чисел: " + dist);
        int max = Math.max (value1, value);
        System.out.println("Максимальное целое число: " + max);
        int min = Math.min (value1, value);
        System.out.println("Минимальное целое число: " + min);

        if (value > value1) {
            System.out.println("Максимальное целое число: " + value);
            System.out.println("Минимальное целое число: " + value1);
        } else {
            System.out.println("Максимальное целое число: " + value1);
            System.out.println("Минимальное целое число: " + value);
        }

    }
}
