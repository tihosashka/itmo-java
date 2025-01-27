package lab3;

public class Car {
    private String colour;
    private String name;
    private String weight;

    public Car(String colour) {
        this.colour = colour;
    }


    public Car(String colour, String weight) {
        this.colour = colour;
        this.weight = weight;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public String getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}

class Main {
    public static void main(String[] args) {
        Car kia = new Car();
        kia.setName("Rio");
        kia.setWeight("3000");
        kia.setColour("White");
        Car audi = new Car("Black", "3000");
        System.out.println(kia.toString());
        System.out.println(audi.toString());

    }
}

