package ref.ex;

import ref.ex.ProductOrder;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder product1;
        ProductOrder product2;
        ProductOrder product3;
        ProductOrder[] products = new ProductOrder[3];
        int sum = 0;

        products[0] = productOrder("두부", 2000, 2);
        products[1] = productOrder("김치", 5000, 1);
        products[2] = productOrder("콜라", 1500, 2);

        printProduct(products);
        totalAmount(products);

//        product1 = new class1.ex.ProductOrder();
//        product1.ProductName = "두부";
//        product1.price = 2000;
//        product1.quantity = 2;
//        products[0] = product1;
//
//        product2 = new class1.ex.ProductOrder();
//        product2.ProductName = "김치";
//        product2.price = 5000;
//        product2.quantity = 1;
//        products[1] = product2;
//
//        product3 = new class1.ex.ProductOrder();
//        product3.ProductName = "콜라";
//        product3.price = 1500;
//        product3.quantity = 2;
//        products[1] = product3;
//
//        for (ProductOrder product : products) {
//
//        }
        //ProductOrder[] products = {product1, product2, product3};
//
//        int sum = 0;
//        for (ProductOrder product : products) {
//            System.out.println("상품명: " + product.productName + ", 가격: " + product.price + ", 수량: " + product.quantity);
//            sum += product.price * product.quantity;
//        }
//        System.out.println("총 결제 금액: " + sum);


    }


    public static ProductOrder productOrder(String productName, int price, int quantity) {
        ProductOrder product = new ProductOrder();
        product.productName = productName;
        product.price = price;
        product.quantity = quantity;

        return product;

    }

    public static void printProduct(ProductOrder[] productOrders) {
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.productName + " 가격: " + productOrder.price + " 수량: " + productOrder.quantity);
        }
    }

    public static void totalAmount(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
        System.out.println("총 결제 금액: " + total + "원");
    }
}
