package lab1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

public class Task16Test {
    @Test
    public void task16Test() {
        Comparator<Book> titleComparator = new Task16.BookTitleComparator();
        Comparator<Book> authorTitleComparator = new Task16.BookAuthorTitleComparator();
        Comparator<Book> titleAuthorComparator = new Task16.BookTitleAuthorComparator();
        Comparator<Book> authorTitlePriceComparator = new Task16.BookAuthorTitlePriceComparator();
        ArrayList<Book> testArray = new ArrayList<>();
        ArrayList<Book> res = new ArrayList<>();
        Book book1 = new Book ("1", "1", 100, 123, 2);
        Book book2 = new Book ("2", "2", 200, 123, 2);
        Book book3 = new Book ("2", "3", 300, 123, 2);
        Book book4 = new Book ("3", "4", 400, 123, 2);
        Book book5 = new Book ("4", "1", 500, 123, 2);

        testArray.add(book1);
        testArray.add(book2);
        testArray.add(book3);
        testArray.add(book4);
        testArray.add(book5);

        res.add(book3);
        res.add(book4);
        res.add(book1);
        res.add(book5);
        res.add(book2);

        res.sort(titleComparator);
        for (int i = 0; i < res.size()-1; i++) {
            assertTrue(res.get(i).getTitle().compareTo(res.get(i+1).getTitle()) <= 0);
        }

        res.sort(titleAuthorComparator);
        for (int i = 0; i < res.size(); i++) {
            assertEquals(testArray.get(i), res.get(i));
        }

        testArray.clear();
        testArray.add(book1);
        testArray.add(book5);
        testArray.add(book2);
        testArray.add(book3);
        testArray.add(book4);
        res.sort(authorTitleComparator);
        for (int i = 0; i < res.size(); i++) {
            assertEquals(testArray.get(i), res.get(i));
        }

        testArray.clear();
        testArray.add(book1);
        testArray.add(book5);
        testArray.add(book2);
        testArray.add(book3);
        testArray.add(book4);
        res.sort(authorTitlePriceComparator);
        for (int i = 0; i < res.size(); i++) {
            assertEquals(testArray.get(i), res.get(i));
        }
    }
}
