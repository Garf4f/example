package ru.garf.view.swing;

import ru.garf.controller.KeyboardInput;
import ru.garf.model.Calc;
import ru.garf.model.Metod;
import javax.swing.*;
import java.awt.*;


public class Window {
    public static JLabel lable;

    public static void dravLable(){
        Window.lable.setText(Float.toString(Calc.getArg2()));
        Window.lable.setFocusable(true);
    }

    public static void dravRuselt(){
        Window.lable.setText(Float.toString(Calc.getArg1()));
        Window.lable.setFocusable(true);
    }


    public static void render(){

        lable = new JLabel("0.0");

        lable.setHorizontalAlignment(JTextField.RIGHT);
        lable.setFont(new Font("Dialog", Font.PLAIN, 24));
        lable.setPreferredSize(new Dimension(260,25));


        JPanel topPanel = new JPanel();

        topPanel.setBackground(Color.white);
        topPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        topPanel.setPreferredSize(new Dimension(280,40));
        topPanel.add(lable);


        JPanel bottomPanel = new JPanel();

        bottomPanel.setBackground(Color.lightGray);
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(5,0,5,0));
        bottomPanel.setPreferredSize(new Dimension(280,260));
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER,4,4));

        bottomPanel.add(new Button(7));
        bottomPanel.add(new Button(8));
        bottomPanel.add(new Button(9));
        bottomPanel.add(new Button("+", Metod.sum));
        bottomPanel.add(new Button("BS", Metod.back));

        bottomPanel.add(new Button(4));
        bottomPanel.add(new Button(5));
        bottomPanel.add(new Button(6));
        bottomPanel.add(new Button("-", Metod.unsum));
        bottomPanel.add(new Button("CE", Metod.clear));

        bottomPanel.add(new Button(1));
        bottomPanel.add(new Button(2));
        bottomPanel.add(new Button(3));
        bottomPanel.add(new Button("*", Metod.mult));
        bottomPanel.add(new Button("C", Metod.clearAll));

        bottomPanel.add(new Button(0));
        bottomPanel.add(new Button(".", Metod.dot));
        bottomPanel.add(new Button("+/-", Metod.invert));
        bottomPanel.add(new Button("/", Metod.dev));
        bottomPanel.add(new Button("=", Metod.result));


        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new BorderLayout());
        panel.add(topPanel, BorderLayout.NORTH);
        panel.add(bottomPanel, BorderLayout.CENTER);


        JFrame frame = new JFrame("CALC2.0");

        frame.setPreferredSize(new Dimension(290, 270));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        lable.setFocusable(true);
        lable.addKeyListener(KeyboardInput.keyboardListener);


    }
}
