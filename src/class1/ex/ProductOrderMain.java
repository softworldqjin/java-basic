package class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder product1;
        ProductOrder product2;
        ProductOrder product3;
        ProductOrder[] products = new ProductOrder[2];

        product1 = new ProductOrder();
        product1.ProductName = "두부";
        product1.price = 2000;
        product1.quantity = 2;
        products[0] = product1;

        product2 = new ProductOrder();
        product2.ProductName = "김치";
        product2.price = 5000;
        product2.quantity = 1;
        products[1] = product2;

        product3 = new ProductOrder();
        product3.ProductName = "콜라";
        product3.price = 1500;
        product3.quantity = 2;
        products[1] = product3;

        //ProductOrder[] products = {product1, product2, product3};

        int sum = 0;
        for (ProductOrder product : products) {
            System.out.println("상품명: " + product.ProductName + ", 가격: " + product.price + ", 수량: " + product.quantity);
            sum += product.price * product.quantity;
        }
        System.out.println("총 결제 금액: " + sum);
    }
}
