package com.javahomework.homework_10;

public class Task_10 {
    public static void main(String[] args) {

//    Представьте, что Вы живёте в Бурдж-Халифе, количество этажей - 163.
//    Ваш лифт работает нестабильно (вот такой вот курьёз) - поднимаясь на каждые 5 этажей,
//    он спускается на 1 этаж. Разработайте алгоритм, используя цикл while и d-while, с помощью
//    которого Вы смогли бы определить за сколько таких итераций (1 итерация: 5 этажей вверх, 1 - вниз)
//    можно добраться до самого верхнего этажа.
//    Принимаем тот факт, что уровень земли это 0й этаж. А так же, если до верха остается менее 5 этажей,
//    то лифт сможет проехать нужный ему промежуток.
//    Попробуйте решить её с помощью циклов while и do-while. Каждый из решений упакуйте в самостоятельный метод.

        System.out.println();
        System.out.println("This is the method While " + burjKhalifaWhile());
        System.out.println();
        System.out.println("This is the method do-While " + burjKhalifaDoWhile());
    }

    static int burjKhalifaWhile() {
        int maxFloors = 163;
        int currentFloor = 0;

        int count = 0;

        while (currentFloor < maxFloors) {
            currentFloor = currentFloor + 5 - 1;
            count++;
        }
        return count;
    }

    static int burjKhalifaDoWhile() {
        int maxFloors = 163;
        int currentFloor = 0;

        int count = 0;

        do {
            currentFloor = currentFloor + 5 - 1;
            count++;
        } while (currentFloor < maxFloors);
        return count;
    }
}
