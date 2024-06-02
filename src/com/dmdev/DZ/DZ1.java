package com.dmdev.DZ;
/*Напишите Java-программу для преобразования температуры из
Фаренгейта в градусы Цельсия.

Тестовые данные:
Введите степень в градусах Фаренгейта: 212

Ожидаемый результат:
212.0 градусов по Фаренгейту равна 100.0 по Цельсию
*/


import java.util.Scanner;

public class DZ1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите в градусах Фаренгейта:");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + " градусов по Фаренгейту равна "  + celsius + " по Цельсию");
    }
}
