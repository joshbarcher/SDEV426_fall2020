package edu.greenriver.sdev.diexample.model.books;

import edu.greenriver.sdev.diexample.model.shelves.IBookShelf;
import org.springframework.stereotype.Component;

@Component
public class BookCollection
{
    private IBookShelf shelf;

    public BookCollection(IBookShelf shelf)
    {
        this.shelf = shelf;
    }

    public void addBookToShelf(Book... books)
    {
        for (Book book : books)
        {
            shelf.add(book);
        }
    }

    public void setShelf(IBookShelf shelf)
    {
        this.shelf = shelf;
    }

    public IBookShelf getShelf()
    {
        return shelf;
    }
}

