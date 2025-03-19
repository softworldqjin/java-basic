package poly.ex.pay1;

public class PayStore {

    public static Pay findPay(String option) {

        if (option.equals("kakao")) {
            return new KakaoPay();

        } else if (option.equals("naver")) {
            return new NaverPay();

        } else if (option.equals("kb")){
            return new KbPay();
        }
        else {
            return new NullPay();
        }
    }
}
