package access.ex;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int intCount;


    public void addItem(Item item) {
        if (intCount > 9) {
            System.out.println("장바구니가 가득찼습니다.");
            return;
        }
        items[intCount] = item;
        intCount++;
    }
    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int total = 0;
        for (int i = 0; i < intCount; i++) {
            Item item = items[i];
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getPrice() * item.getQuantity());
            total += item.getPrice() * item.getQuantity();
        }
        System.out.println("전체 금액:" + total);
    }
}

