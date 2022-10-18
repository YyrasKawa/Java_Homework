package com.javahomework.homework_5;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {

//      Реализовать метод, который конвертирует сумму в евро в эквивалент
//      долларов США (выберите курс, который соответствует дню,
//      в который Вы выполняете это задание)

        System.out.println("Введите сумму евро для обмена: ");
        Scanner scanner = new Scanner(System.in);
        int euro = scanner.nextInt();

        System.out.println("Сумма доллоров к получению: " + dollar(euro));

        scanner.close();
    }

    public static double dollar(int c) {
        return c * 0.97;
    }

}
