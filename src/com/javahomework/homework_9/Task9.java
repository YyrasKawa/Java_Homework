package com.javahomework.homework_9;

public class Task9 {
    public static void main(String[] args) {

//        Представьте, что Вы живёте в Бурдж-Халифе, количество этажей - 163.
//        Ваш лифт работает нестабильно (вот такой вот курьёз) - поднимаясь на каждые 5 этажей,
//        он спускается на 1 этаж. Разработайте алгоритм, используя цикл for, с помощью которого
//        Вы смогли бы определить за сколько таких итераций (1 итерация: 5 этажей вверх, 1 - вниз)
//        можно добраться до самого верхнего этажа.
//        Принимаем тот факт, что уровень земли это 0й этаж. А так же, если до верха остается
//        менее 5 этажей, то лифт сможет проехать нужный ему промежуток.

        int iter = 0;
        int a = 5;
        int b = 1;

        for (int i = 0; i <= 163; i = i + (a - b)) {

            System.out.println("Floor number: " + i);
            System.out.println();

            iter++;
        }
        int result = iter + 1;
        System.out.println("Количество итераций: " + result);

    }
}