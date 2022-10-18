package com.javahomework.homework_6;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

//  Требуется написать программу, которая будет получать из командной строки
//  текущее время (в одну переменную запишется количество текущих часов,
//  в другую - количество текущих минут) и определять суммарное количество
//  секунд до конца дня, суммарное количество минут до конца дня и суммарное
//  количество часов до конца дня.

        System.out.println("Введите текущее время, часы: ");
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        System.out.println("Введите текущее время, минуты: ");
        int minute = scanner.nextInt();


        int seconds = ((17 - hour) * 3600) - (minute * 60);

        if (seconds <= 28800 && seconds >= 0) {
            System.out.println("Количество секунд до конца рабочего дня: " + seconds);
            System.out.println("Количество минут до конца рабочего дня: " + (seconds / 60));
            System.out.println("Количество часов до конца рабочего дня: " + (seconds / 3600));

        } else if (seconds > 28800){
            System.out.println("Рабочий день ещё не начался");

        } else {
            System.out.println("Рабочий день уже закончился");
        }

        scanner.close();
    }

}
