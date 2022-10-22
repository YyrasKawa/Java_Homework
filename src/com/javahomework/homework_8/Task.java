package com.javahomework.homework_8;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

//      Имеется автомат по приготовлению кофе, есть 4 кнопки для выбора напитка:
//      эспрессо, американо, капучино, чай. Необходимо написать алгоритм, используя
//      switch-case конструкцию для создания этих напитков, процесс приготовления которых
//      будет напечатан в консоли. При этом, каждый напиток включает в себя определенные
//      действия (элементарные процессы, будут описаны ниже), которые можно упаковать
//      в самостоятельные методы, для их многократного использования.
//      Выбор кнопки можно считать через командную строку (например в int значение).
//      Приготовление эспрессо - минимально неразделимый процесс.
//      Приготовление американо - эспрессо + добавление воды.
//      Приготовление капучино - эспрессо + добавление вспененного молока.
//      Приготовление чая - выбор чайного пакетика + добавление воды.

        System.out.println("Please select a drink");
        System.out.println("Espresso - press button one: 1");
        System.out.println("Americano - press button two: 2");
        System.out.println("Cappuccino - press button three: 3");
        System.out.println("Tea - press button four: 4");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 1 -> {
                System.out.println("Your coffee is being prepared");
                makeEspresso();
                System.out.println("Take your Espresso");
            }

            case 2 -> {
                System.out.println("Your coffee is being prepared");
                makeEspresso();
                addWater();
                System.out.println("Take your Americano");
            }

            case 3 -> {
                System.out.println("Your coffee is being prepared");
                makeEspresso();
                addWater();
                addMilk();
                System.out.println("Take your Cappuccino");
            }

            case 4 -> {
                System.out.println("Tea bag selection please");
                addWater();
                teaSelection();
                System.out.println("Take your Tea");
            }
        }
    scanner.close();

    }

    private static void makeEspresso() {
        System.out.println("Coffee preparation...");
    }

    private static void addWater() {
        System.out.println("Add water");
    }

    private static void addMilk() {
        System.out.println("Add milk");
    }

    private static void teaSelection() {
        System.out.println("Green or Black");
    }

}
