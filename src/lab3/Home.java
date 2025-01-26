package lab3;

import java.time.Year;

public class Home {
    private Integer QuantityFloors;
    private int YearOfConstruction;
    private String Name;

    public void setQuantityFloors(Integer quantityFloors) {
        QuantityFloors = quantityFloors;
    }

    public void setYearOfConstruction(Integer yearOfConstruction) {
        YearOfConstruction = yearOfConstruction;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Home{" +
                "QuantityFloors=" + QuantityFloors +
                ", YearOfConstruction=" + YearOfConstruction +
                ", Name='" + Name + '\'' +
                '}';
    }
    public int Age() {
        int result;
        return result = Year.now().getValue() - YearOfConstruction;
    }
}
class MainHome {
    public static void main (String[] args) {
        Home PulsePremier = new Home ();
        PulsePremier.setName("PulsePremier");
        PulsePremier.setQuantityFloors(10);
        PulsePremier.setYearOfConstruction(2024);
        Home AstraMarine = new Home ();
        AstraMarine.setName("AstraMarine");
        AstraMarine.setQuantityFloors(15);
        AstraMarine.setYearOfConstruction(2022);
        System.out.println(PulsePremier.toString());
        System.out.println(AstraMarine.toString());
    }
}
