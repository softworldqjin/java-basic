package poly.ex.pay0;

public class PayMain0 {

    public static void main(String[] args) {

        PayService payService = new PayService();

        //kakao결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        //naver결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        //kakao결제
        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);

        //newpay결제
        String payOption4 = "new";
        int amount4 = 10000;
        payService.processPay(payOption4,amount4);
    }


}
