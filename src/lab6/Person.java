package lab6;

public abstract class Person {
    protected String Name;
    protected String Surname;

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public Person(String name, String surname) {
        Name = name;
        Surname = surname;
    }
    public abstract void printInfo();
}
