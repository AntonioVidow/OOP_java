package Test4;

public class Book extends Product{
    private String author;
    private String title;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book(String inventoryNumber, double price, int quantity, Provider provider, String author, String title) throws WrongPhoneNumberException {
        super(inventoryNumber, price, quantity, provider);
        this.author = author;
        this.title = title;
    }

    @Override
    public double getPromotionalPrice() {
        return getPrice()*0.5;
    }
}
