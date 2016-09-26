package ru.garf.view.swing;

import javax.swing.*;
import java.awt.*;

import ru.garf.controller.WindowListeners;
import ru.garf.model.Calc;
import ru.garf.model.Metod;


public class Button extends JButton {

    public Button(int num) {
        this.setPreferredSize(new Dimension(50,40));
        this.setText(Integer.toString(num));
        this.setFocusable(false);
        this.addActionListener(e -> WindowListeners.nums(num));

    }


    public Button(String s, Metod metod) {
        this.setPreferredSize(new Dimension(50,40));
        this.setText(s);
        this.setFocusable(false);
        this.addActionListener(e -> WindowListeners.btnMetod(metod));

    }




}
