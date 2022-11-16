package ex2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MyAnimalShop implements AnimalShop {
    double balance;
    double porfit;
    ArrayList<Animal> AnimalList = new ArrayList<>();
    ArrayList<Customer> CustomerList = new ArrayList<>();
    boolean isOpen;

    public MyAnimalShop(double balance, boolean isOpen) {
        this.balance = balance;
        this.isOpen = isOpen;
    }

    @Override

    public void buyNewPet(Animal animal) {
        if (balance - animal.price < 0) {
            throw new InsufficientBalanceException();//如果余额不足，就抛出余额不足异常，并购买失败。
        } else {
            this.balance -= animal.price;
            AnimalList.add(animal);
            System.out.println("购买成功，花费" + animal.price + "元");
            System.out.println("您当前的余额为："+this.balance+"元");
        }
    }

    @Override
    public void serveCustomer(Customer customer) {
        System.out.println("欢迎光临," + customer.name + "！");
        CustomerList.add(customer);
        customer.setStoreVisits(customer.getStoreVisits()+1);
        customer.setLastVisitTime(LocalDate.now());
        Scanner scanner = new Scanner(System.in);
        System.out.println("您想买什么动物？本店现在有：");
        for (int i = 0; i < AnimalList.size(); i++) {
            Animal a = AnimalList.get(i);
            System.out.println(a.name);
        }
        String animalName = scanner.nextLine();
        if (contains(AnimalList, animalName)) {

            for (int i = 0; i < AnimalList.size(); i++) {
                Animal a = AnimalList.get(i);
                String newBoughtName = a.getName();
                if (animalName.equals(newBoughtName)) {
                    AnimalList.remove(i);
                    this.balance += a.price * 1.2;//我每一个宠物的利润都是20%，不过分吧！
                    this.porfit += a.price*0.2;
                    System.out.println("购买成功，您买了" + animalName + " 年龄：" + a.age + " 性别：" + a.gender + " 价格：" + a.price * 1.2);
                }
            }
        } else {
            throw new AnimalNotFountException();
        }

    }

    public static boolean contains(ArrayList<Animal> list, String name) {//判断动物是否在列表内的方法
        for (int i = 0; i < list.size(); i++) {
            Animal a = list.get(i);
            String animalName = a.getName();
            if (animalName.equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void close() {
        this.isOpen=false;
        System.out.println("本店已打烊！");
        System.out.println("今日招待客人：");
        for (int i = 0; i < CustomerList.size(); i++) {
            Customer c = CustomerList.get(i);
            System.out.println(c.getName()+",进店次数："+c.getStoreVisits()+"上次光临时间"+c.getLastVisitTime());
        }
        System.out.println("今日净收入："+this.porfit);


        

    }
}
