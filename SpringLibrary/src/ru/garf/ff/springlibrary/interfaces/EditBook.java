package ru.garf.ff.springlibrary.interfaces;

import ru.garf.ff.springlibrary.objects.Book;

/**
 * Created by ACER on 30.10.2016.
 */
public interface EditBook {

    boolean save(Book book);
    boolean delete(Book book);
    boolean edit(Book book);
    boolean add(Book book);

}
