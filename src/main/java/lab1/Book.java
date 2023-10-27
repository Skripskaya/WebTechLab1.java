package lab1;

public class Book implements Cloneable, Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition;

    public Book() {
    }
    public Book(String title, String author, int price, int isbn, int edition) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
        this.edition = edition;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String newTitle) {
        title = newTitle;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String newAuthor) {
        author= newAuthor;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int newPrice) {
        price = newPrice;
    }
    public int getIsbn(){
        return isbn;
    }
    public void setIsbn(int newIsbn){
        isbn = newIsbn;
    }
    public static int getEdition() {
        return edition;
    }
    public static void setEdition(int newEdition) {
        edition = newEdition;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass() != getClass()) {
            return false;
        }
        Book book = (Book) object;
        if (title   != book.title  ||
                author  != book.author ||
                price   != book.price  ||
                edition != book.edition) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (author != null ? author.hashCode() : 0);
        hash += (title != null ? title.hashCode() : 0);
        hash *= (price != 0 ? price*31 : 1);
        hash *= (edition != 0 ? edition : 1);
        return hash;
    }

    @Override
    public String toString(){
        StringBuilder stringFormer = new StringBuilder();
        stringFormer.append(getClass() + "(")
                .append("title: " + title + "; ")
                .append("author: " + author + "; ")
                .append("price: " + price + "; ")
                .append("isbn: " + isbn + "; ")
                .append("edition: " + Book.edition + ")");
        return stringFormer.toString();
    }

    public Object clone() throws CloneNotSupportedException {
         return (Book) super.clone();
    }

    public int compareTo(Book other) {
        return isbn - other.isbn;
    }
}

