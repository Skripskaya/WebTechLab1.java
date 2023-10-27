package lab1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class Task15Test {
    @Test
    public void TaskFifteenCheck() {
        Random rand = new Random();
        Book[] books = new Book[10];

        for (int i = 0; i < books.length; i++) {
            books[i] = new Book("default", "default", 0, rand.nextInt(100), 0);
        }

        Arrays.sort(books);
        for (int i = 0; i < books.length-1; i++) {
            assertTrue(books[i].getIsbn() <= books[i + 1].getIsbn());
        }
    }
}
