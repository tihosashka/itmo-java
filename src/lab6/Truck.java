package lab6;

import java.util.Scanner;

public class Truck extends Car{

private Integer QuantityOfWheels;
private Integer maxWeight;

    public void newWheels() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество колес");
        QuantityOfWheels=scanner.nextInt();
    System.out.println(QuantityOfWheels);
}

    public Truck(int w, String m, char c, float s, Integer quantityOfWheels, Integer maxWeight) {
        super(w, m, c, s);
        QuantityOfWheels = quantityOfWheels;
        this.maxWeight = maxWeight;
    }

}
