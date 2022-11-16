package ex2;

public class Rabbit extends Animal{
    public Rabbit(String name, int age, String gender, double price) {
        super(name, age, gender, price);
    }

    @Override
    public String toString() {
        return null;
    }
    private  static int price = 10000000;
}
