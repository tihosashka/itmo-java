package lab6;

public class Child extends Parent{

    public Child(Integer number) {
        super(number);
    }

    public void printnumber() {
        System.out.println(super.number);
    }
}
