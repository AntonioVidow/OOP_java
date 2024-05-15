package Abstraction_EXE;

public class Book extends Stocks{
    private String nameOfBook;
    private String writer;

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Book(double price, String id, String nameOfBook, String writer) {
        super(price, id);
        this.nameOfBook = nameOfBook;
        this.writer = writer;
    }

    @Override
    public double checkPromo(double percentPromo) {
        return getPrice() - (getPrice()*percentPromo);
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfBook='" + nameOfBook + '\'' +
                ", writer='" + writer + '\'' +
                ", price= " + getPrice() + '\'' +
                '}';
    }
}
