package ex2;

public class AnimalNotFountException extends RuntimeException{

    public AnimalNotFountException( ) {

    }
    @Override
    public String toString() {
        return "您要的宠物我这里暂时还没有！";
    }
}
