package lab6;

import java.util.Scanner;

public class maintask5 {
    protected String name;
    protected Integer age;
    Scanner scanner = new Scanner(System.in);

    public void getage() {
        System.out.println("Введите возраст пользователя");
        age=scanner.nextInt();
        System.out.println(age);
    }
}
