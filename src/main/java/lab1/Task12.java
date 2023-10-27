package lab1;

public class Task12 {
    public class Book {
        private String title;
        private String author;
        private int price;
        private static int edition;

        public Book() {

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
                    .append("edition: " + Book.edition + ")");
            return stringFormer.toString();
        }
    }

    public static void main (String args[]) {

    }
}
