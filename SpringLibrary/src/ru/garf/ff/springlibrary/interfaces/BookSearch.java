package ru.garf.ff.springlibrary.interfaces;

import ru.garf.ff.springlibrary.objects.Author;
import ru.garf.ff.springlibrary.objects.Book;
import ru.garf.ff.springlibrary.objects.Genre;

import java.util.List;

/**
 * Created by ACER on 30.10.2016.
 */
public interface BookSearch {

    List<Book> getBooks();

    List<Book> getBooks(Author author);

    List<Book> getBooks(String bookName);

    List<Book> getBooks(Genre genre);

    List<Book> getBooks(Character letter);

}
