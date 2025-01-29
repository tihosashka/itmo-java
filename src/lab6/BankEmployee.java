package lab6;

public class BankEmployee extends Person implements Interface{
    private String BankName;

    public BankEmployee(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void printInfo() {
        System.out.println(super.Surname + super.Name);
    }

    @Override
    public String bankName() {
        return "Sber";
    }
}
