package ex2;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        //测试输出客户信息
        Customer c1 = new Customer("liu", 100, LocalDate.of(2004, 9, 6));
        System.out.println(c1.toString());
        System.out.println("======================================");
        //实例化我的宠物店
        MyAnimalShop huaTianShop = new MyAnimalShop(10000, true);
        //实例化三种动物每种一个在市场上的情况和进价。
        Animal cat = new Cat("Cat1", 3, "M", 200);
        Animal ChinesePastoralDog = new ChinesePastoralDog("Dog1", 3, "F", 100);
        Animal Rabbit = new Rabbit("Rabbit1", 3, "M", 10000000);
        Customer lmt = new Customer("lmt", 100, LocalDate.of(2003, 11, 15));
        //开业！
        //先进两只宠物试试
        huaTianShop.buyNewPet(cat);
        huaTianShop.buyNewPet(ChinesePastoralDog);
        //好，然后买一只超级贵的兔子，看看会发生什么。
        try {
            huaTianShop.buyNewPet(Rabbit);
        } catch (InsufficientBalanceException e) {
            System.out.println("购买失败！余额不足");
        }
        //果然购买失败。
        //好 现在服务客人
        huaTianShop.serveCustomer(lmt);
        //可以输入一些不存在于店里的宠物试试
        //服务另外一个客人
        huaTianShop.serveCustomer(c1);
        System.out.println("==============================");
        huaTianShop.close();
    }
}
