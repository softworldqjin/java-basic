package poly.ex.pay0;

public class NewPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("New와 연결합니다.");
        System.out.println(amount + "원 결제 시도");
        return true;
    }
}
