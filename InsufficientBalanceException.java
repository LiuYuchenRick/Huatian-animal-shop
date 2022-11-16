package ex2;

public class InsufficientBalanceException extends RuntimeException{


    public InsufficientBalanceException( ) {

    }

    @Override
    public String toString() {
        return "余额不足，购买失败";
    }
}
