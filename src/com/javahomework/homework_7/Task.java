package com.javahomework.homework_7;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

//        Создайте две переменные "isWeekend" и "isRain", значения которых можно
//        получить из командной строки. Создайте переменную "canWalk", значение которой
//        должно быть истинным, если это выходной день (isWeekend=true) и не идет дождь (isRain=false),
//        и ложным (для переменной "canWalk" в любом другом случае.

        System.out.println("Is today a day off? (yes or no):");
        Scanner scanner = new Scanner(System.in);
        String oneScan = scanner.nextLine();
        System.out.println("Today the rain? (yes or no):");
        String twoScan = scanner.nextLine();

        boolean isWeekend = oneScan.equals("yes");
        boolean isRain = twoScan.equals("no");

        boolean canWalk = isWeekend && isRain;


        if (canWalk) {
            System.out.println("You can walk");
        } else {
            System.out.println("You can't walk");
        }
        scanner.close();
    }

}
