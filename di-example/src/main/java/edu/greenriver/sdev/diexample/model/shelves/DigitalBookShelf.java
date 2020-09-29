package edu.greenriver.sdev.diexample.model.shelves;

import edu.greenriver.sdev.diexample.model.books.Book;
import org.springframework.stereotype.Component;

@Component
public class DigitalBookShelf implements IBookShelf
{
    public DigitalBookShelf()
    {
        System.out.println();
    }

    public void add(Book book)
    {
        System.out.println("Book added to digital shelf");
    }

    public boolean remove(Book book)
    {
        return false;
    }

    public boolean contains(Book book)
    {
        return false;
    }
}
