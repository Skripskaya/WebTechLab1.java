package lab1;

import java.util.Comparator;

public class Task16 {
    public static class BookTitleComparator implements Comparator<Book> {
        public int compare (Book o1, Book o2) {
            String title1 = o1.getTitle();
            String title2 = o2.getTitle();
            return title1.compareTo(title2);
        }
    }

    public static class BookTitleAuthorComparator implements Comparator<Book> {
        public int compare (Book o1, Book o2) {
            String title1 = o1.getTitle();
            String title2 = o2.getTitle();
            if(title1.compareTo(title2) > 0) {
                return 1;
            } else if (title1.compareTo(title2) < 0) {
                return -1;
            } else {
                String author1 = o1.getAuthor();
                String author2 = o2.getAuthor();
                return author1.compareTo(author2);
            }
        }
    }

    public static class BookAuthorTitleComparator implements Comparator<Book> {
        public int compare (Book o1, Book o2) {
            String author1 = o1.getAuthor();
            String author2 = o2.getAuthor();
            if(author1.compareTo(author2) > 0) {
                return 1;
            } else if (author1.compareTo(author2) < 0) {
                return -1;
            } else {
                String title1 = o1.getTitle();
                String title2 = o2.getTitle();
                return title1.compareTo(title2);
            }
        }
    }

    public static class BookAuthorTitlePriceComparator implements Comparator<Book> {
        public int compare (Book o1, Book o2) {
            String author1 = o1.getAuthor();
            String author2 = o2.getAuthor();
            if(author1.compareTo(author2) > 0) {
                return 1;
            } else if (author1.compareTo(author2) < 0) {
                return -1;
            } else {
                String title1 = o1.getTitle();
                String title2 = o2.getTitle();
                if(title1.compareTo(title2) > 0) {
                    return 1;
                } else if (title1.compareTo(title2) < 0) {
                    return -1;
                } else {
                    int price1 = o1.getPrice();
                    int price2 = o2.getPrice();
                    return price1 - price2;
                }
            }
        }
    }
}
