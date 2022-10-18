package com.javahomework.homework_5;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

//      1. введите слово, используя сканер, состоящий из четного количества букв
//      (проверьте количество букв в слове - вывести в консоль количество).
//      Получить слово, состоящее из первой половины слова и второй половины слова.
//      Распечатайте их в консоль.

        System.out.println("Введите слово состоящие из четного количества букв");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int lenght = str.length();

        if (lenght % 2 == 0) {
            System.out.println("Количество букв в слове: " + lenght);
            System.out.println("Первая часть слова: " + str.substring(0, lenght / 2) +
                    " - Вторая часть слова: - " + str.substring(lenght / 2));
        } else {
            System.out.println("Нечётное количество букв");
        }
        scanner.close();
    }
}
