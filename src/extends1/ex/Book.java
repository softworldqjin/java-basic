package extends1.ex;

public class Book extends Item {
    public String name;
    public String isbn;

    public Book(String author, int price, String name, String isbn) {
        super(author, price);
        this.name = name;
        this.isbn = isbn;


    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 저자:" + name + ", isbn:" + isbn);
    }
}
