package lab1;

import java.util.Scanner;

/**
 * author Alexandra Tikhonenko
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        System.out.println("Задание 2:");
        double result1 = ((46 + 10) * (10 / (double) 3));
        System.out.println(result1);
        int result2 = 29 * 4 * (-15);
        System.out.println(result2);

        System.out.println("Задание 3:");
        short number = 10500;
        short result = (short) ((number / 10) / 10);
        System.out.println(result);

        System.out.println("Задание 4:");
        double g = 3.6;
        double h = 4.1;
        double i = 5.9;
        double result3 = g * h * i;
        System.out.println(result3);

       System.out.println("Задание 5:");
       Scanner scanner = new Scanner(System.in);
       int x = scanner.nextInt();
       int y = scanner.nextInt();
       int z = scanner.nextInt();
       System.out.println(x);
       System.out.println(y);
       System.out.println(z);

        System.out.println("Задание 6:");
        Scanner scanner2 = new Scanner(System.in);
        int b = scanner2.nextInt();
        if (b%2 == 0 && b>100) {
            System.out.println("Выход за пределы диапазона");
        } else {
        if (b%2 != 0) {
            System.out.println("Нечетное");
        } else {
            if (b%2 == 0) {
                System.out.println("Четное");
            }
        }

        }
    }
}
