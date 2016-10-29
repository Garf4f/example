package ru.garf.ff.springlibrary.interfaces;

import ru.garf.ff.springlibrary.objects.User;

/**
 * Created by ACER on 30.10.2016.
 */
public interface SecureLibrary {

    boolean login(User user);

    void logout(User user);

}
