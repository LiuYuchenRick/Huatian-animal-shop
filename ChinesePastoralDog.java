package ex2;

public class ChinesePastoralDog extends Animal{
    public ChinesePastoralDog(String name, int age, String gender, double price) {
        super(name, age, gender, price);
    }
    @Override
    public String toString() {
        return null;
    }

    protected boolean isVaccineInjected;

    public boolean isVaccineInjected() {
        return isVaccineInjected;
    }

    public void setVaccineInjected(boolean vaccineInjected) {
        isVaccineInjected = vaccineInjected;
    }
    private static int price = 100;
}
