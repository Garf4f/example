package ru.garf.ff.springlibrary.interfaces;

import ru.garf.ff.springlibrary.objects.Book;

/**
 * Created by ACER on 30.10.2016.
 */
public interface ShowBook {

    void showBook(Book book);

    void downloadBook(Book book);

    void voteBook(Book book);


}
