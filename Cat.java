package ex2;

public class Cat extends Animal{
    public Cat(String name, int age, String gender, double price) {
        super(name, age, gender, price);
    }

    @Override
    public String toString() {
        return null;
    }

    private static int price = 100;

}
