package lab6;

public class childtask5 extends maintask5 {

    @Override
    public void getage() {
        System.out.println("Введите имя пользователя");
        super.name=scanner.nextLine();
        System.out.println(super.name);
    }
}
