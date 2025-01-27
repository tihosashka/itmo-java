package lab3;

public class Tree {
    private Double Age;
    private Boolean Alive;
    private String Name;

    public Tree(Double age, String name) {
        Age = age;
        Name = name;
    }

    public Tree(Double age, Boolean alive, String name) {
        Age = age;
        Alive = alive;
        Name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без парметров сработал");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "Age=" + Age +
                ", Alive=" + Alive +
                ", Name='" + Name + '\'' +
                '}';
    }
}

class MainTree {
    public static void main(String[] args) {
        Tree Birch = new Tree(30.5, "Maria");
        Tree Mapple = new Tree(50.0, true, "Dmitry");
        Tree Oak = new Tree();
        System.out.println(Birch);
        System.out.println(Mapple);
        System.out.println(Oak);
    }
}
