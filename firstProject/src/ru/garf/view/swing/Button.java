package ru.garf.view.swing;

import javax.swing.*;
import java.awt.*;
import ru.garf.controller.WindowListeners;
import ru.garf.model.Metod;


public class Button extends JButton {

    public Button(int num, Window window) {
        this.setPreferredSize(new Dimension(50,40));
        this.setText(Integer.toString(num));
        this.addActionListener(e -> WindowListeners.nums(num,window));

    }


    public Button(String s, Metod metod, Window window) {
        this.setPreferredSize(new Dimension(50,40));
        this.setText(s);
        this.addActionListener(e -> WindowListeners.btnMetod(metod,window));

    }




}
