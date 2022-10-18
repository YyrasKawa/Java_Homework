package com.javahomework.homework_5;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

//        Реализовать класс с функционалом, который выводит на экран
//        результаты сложения, вычитания, умножения и деления двух чисел.
//        Каждая из арифметических операций должна быть реализована как отдельный метод.

        System.out.println("Введите первое целое число");
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        System.out.println("Введите второе целое число");
        int two = scanner.nextInt();

        System.out.println("Сложение = " + sum(one, two));
        System.out.println("Вычитание = " + subtraction(one, two));
        System.out.println("Умножение = " + multiplication(one, two));
        System.out.println("Деление = " + division(one, two));


    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int subtraction(int a, int b) {
        return a - b;
    }
    public static int multiplication(int a, int b) {
        return a * b;
    }
    public static int division(int a, int b) {
        return a / b;
    }


}
