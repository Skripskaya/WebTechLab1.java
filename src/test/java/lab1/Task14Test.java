package lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task14Test {
    @Test
    void task14Test() throws CloneNotSupportedException{
        Book originalBook = new Book();
        Book cloneBook;
        cloneBook =(Book) originalBook.clone();
        assertTrue(originalBook!=cloneBook);
        assertTrue(originalBook.getClass() == cloneBook.getClass());
        assertEquals(originalBook, cloneBook);
        cloneBook.setAuthor("author");
        assertNotEquals(originalBook,cloneBook);
    }

}
