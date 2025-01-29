package lab4;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void Oddnumbers() {
        for (int x = 0; x < 100; x++) {
            if (x % 2 == 0) {
                continue;
            } else {
                System.out.println(x);
            }
        }
    }

    public static void dev() {
        for (int x = 1; x < 101; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("Делится на 3 и на 5: " + x);
            } else if (x % 3 == 0) {
                    System.out.println("Делится на 3: " + x);
                } else if (x % 5 == 0) {
                    System.out.println("Делится на 5: " + x);
                }

            }
        }

        public  static void sum() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число:");
            int x = scanner.nextInt();
            System.out.println("Введите второе число:");
            int y = scanner.nextInt();
            System.out.println("Введите третье число:");
            int z = scanner.nextInt();
            if (x + y == z) {
                System.out.println("Результат: true");
            } else System.out.println("Результат: false");
        }

    public  static void compare() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int x = scanner.nextInt();
        System.out.println("Введите второе число:");
        int y = scanner.nextInt();
        System.out.println("Введите третье число:");
        int z = scanner.nextInt();
        if (y>x && z>y) {
            System.out.println("Результат: true");
        } else System.out.println("Результат: false");
    }

    public static void array(){
        int[] array = {3, -3, 7, 4, 5, 4, 3};
        if (array[0] == 3 && array[array.length - 1] == 3) {
            System.out.println("Результат: true");
        } else System.out.println("Результат: false");
    }

    public static void array2(){
        int[] array = {3, -3, 7, 4, 5, 4, 3};
        int i=1;
        int j=3;
        boolean result = false;
        for (int element : array) {
            if (element == i || element == j) {
                result = true;
                break;
            }
        }
        System.out.println("Результат:" + result);
    }

    public static void inputarray () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length:");
        int a = scanner.nextInt();
        int[] ints = new int[a];
        System.out.println("Numbers of array:");
        for (int i = 0; i < a; i++) {
            ints[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(ints));
    }

    public static void changeplace() {
        int[] array = {5, 6, 7, 2};
        System.out.println("Array 1: " + Arrays.toString(array));
        int[] array2 = new int [array.length];
        array2=array;
        array2 [0] = array[array.length - 1];
        array2 [array2.length - 1] = array[0];
        System.out.println("Array 2: " + Arrays.toString(array2));
    }

    public static void tryAgain() {
        int[] array = {5, 6, 7, 8};
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i + 1]){
                System.out.println("Please, try again");
            break;
        } else if (i== array.length - 2){
                System.out.println("OK");};
        }
    }

    public static void unique() {
        int[] a = {1, 2, 3, 1 , 2, 4};
        int[] b = a;
        for (int i = 0; i < (a.length - 1); i++) {
            if (a[i] == b[i + 1])
                continue;
            else if (i == a.length - 1)
                System.out.println(a[i]);
            else {
                for ( int j=i+2; j<a.length; j++) {
                    if (a[i] == b[j])
                        break;
                    else if (j == a.length - 1) {
                        System.out.println(a[i]);
                        return;
                    }
                }
            }
        }
    }



    public static void main(String[] args) {
        System.out.println("Задание 1:");
        Main.Oddnumbers();
        System.out.println("=================");
        System.out.println("Задание 2:");
        Main.dev();
        System.out.println("=================");
        System.out.println("Задание 3:");
        Main.sum();
        System.out.println("=================");
        System.out.println("Задание 4:");
        Main.compare();
        System.out.println("=================");
        System.out.println("Задание 5:");
        Main.array();
        System.out.println("=================");
        System.out.println("Задание 6:");
        Main.array2();
        System.out.println("=================");
        System.out.println("Часть 2:");
        System.out.println("Задание 1:");
        Main.tryAgain();
        System.out.println("=================");
        System.out.println("Задание 2:");
        Main.inputarray();
        System.out.println("=================");
        System.out.println("Задание 3:");
        Main.changeplace();
        System.out.println("=================");
        System.out.println("Задание 4:");
        Main.unique();









    }
}





