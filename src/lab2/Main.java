package lab2;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.setBrand("Apple");
        mobilePhone.setModel("Iphone13mini");
        mobilePhone.setPrice(123456.89);
        mobilePhone.setColour(Colour.Grey);
        System.out.println(mobilePhone);
        System.out.println(mobilePhone.getColour().getDescription());


        Calculator calc = new Calculator();
        System.out.println(calc.Sum(5,6));
        System.out.println(calc.Devision(5.5,5.5));
        System.out.println(calc.Multiplication(1000000000000000L,1000000000000000L));
        System.out.println(calc.Subtraction(5,6));
    }
}
