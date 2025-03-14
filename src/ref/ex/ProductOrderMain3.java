package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        int count = inputCount();
        ProductOrder1[] products = new ProductOrder1[count];

        inputProduct(products, count);
        printProduct(products, count);
        int totalAmount = totalAmount(products, count);
        System.out.println("총 결제 금액: " + totalAmount);

    }

    public static int inputCount() {
        Scanner input = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int count = input.nextInt();
        input.nextLine();
        return count;
    }
    public static void inputProduct(ProductOrder1[] products, int count) {
        for (int i = 0; i < count; i++) {
            Scanner input1 = new Scanner(System.in);
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
            products[i] = new ProductOrder1();
            System.out.print("상품명: ");
            products[i].productName = input1.nextLine();
            System.out.print("가격: ");
            products[i].price = input1.nextInt();
            input1.nextLine();
            System.out.print("수량: ");
            products[i].quantity = input1.nextInt();

        }
    }

    public static void printProduct(ProductOrder1[] products, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("상품명: " + products[i].productName + " 가격: " + products[i].price + " 상품명: " + products[i].quantity);
        }
    }

    public static int totalAmount(ProductOrder1[] products, int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += products[i].price * products[i].quantity;
        }
        return total;
    }
}
