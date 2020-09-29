package edu.greenriver.sdev.diexample;

import edu.greenriver.sdev.diexample.model.books.BookCollection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiExampleApplication
{
    public static void main(String[] args)
    {
        ApplicationContext context = SpringApplication.run(
                DiExampleApplication.class, args);

        BookCollection collection = context.getBean(BookCollection.class);
        System.out.println(collection);
    }
}
