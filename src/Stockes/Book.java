package Stockes;

public class Book extends Stock{
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(int id, double price, String title, String author) {
        super(id, price);
        this.title = title;
        this.author = author;
    }

    @Override
    public double checkPromo(double  promo) {
        return getPrice() - (getPrice() * (promo/100));
    }
}
