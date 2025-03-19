package poly.ex.pay0;
import java.util.Scanner;
public class PayMain1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PayService payService = new PayService();

        while (true) {
            System.out.print("결제 수단을 입력하세요: ");
            String payOption = scanner.nextLine();

            if (payOption.equals("exit")) {
                System.out.println("프로그램 종료");
                return;
            }

            System.out.print("결제 금액을 입력하세요: ");
            int amount = scanner.nextInt();
            scanner.nextLine();

            payService.processPay(payOption, amount);
        }
    }
    }

//        //kakao결제
//        String payOption1 = "kakao";
//        int amount1 = 5000;
//        payService.processPay(payOption1, amount1);
//
//        //naver결제
//        String payOption2 = "naver";
//        int amount2 = 10000;
//        payService.processPay(payOption2, amount2);
//
//        //kakao결제
//        String payOption3 = "bad";
//        int amount3 = 15000;
//        payService.processPay(payOption3, amount3);
//
//        //newpay결제
//        String payOption4 = "new";
//        int amount4 = 10000;
//        payService.processPay(payOption4,amount4);
//    }



