package ru.garf.view.swing;

import ru.garf.model.Metod;
import javax.swing.*;
import java.awt.*;


public class Window {
    public  JLabel lable;

    public Window() {

        lable = new JLabel("0.0");

        lable.setHorizontalAlignment(JTextField.RIGHT);
        lable.setFont(new Font("Dialog", Font.PLAIN, 24));
        lable.setPreferredSize(new Dimension(240,25));


        JPanel topPanel = new JPanel();

        topPanel.setBackground(Color.white);
        topPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        topPanel.setPreferredSize(new Dimension(250,40));
        topPanel.add(lable);

        JPanel bottomPanel = new JPanel();

        bottomPanel.setBackground(Color.green);
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        bottomPanel.setPreferredSize(new Dimension(250,360));
        bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT,7,5));


        bottomPanel.add(new Button(7,this));
        bottomPanel.add(new Button(8,this));
        bottomPanel.add(new Button(9,this));
        bottomPanel.add(new Button("BS", Metod.back,this));

        bottomPanel.add(new Button(4,this));
        bottomPanel.add(new Button(5,this));
        bottomPanel.add(new Button(6,this));
        bottomPanel.add(new Button("CE", Metod.clear,this));

        bottomPanel.add(new Button(1,this));
        bottomPanel.add(new Button(2,this));
        bottomPanel.add(new Button(3,this));
        bottomPanel.add(new Button("C", Metod.clearAll,this));

        bottomPanel.add(new Button(0,this));
        bottomPanel.add(new Button(".", Metod.dot,this));
        bottomPanel.add(new Button("+/-", Metod.invert,this));
        bottomPanel.add(new Button("=", Metod.result,this));

        bottomPanel.add(new Button("+", Metod.sum,this));
        bottomPanel.add(new Button("-", Metod.unsum,this));
        bottomPanel.add(new Button("*", Metod.mult,this));
        bottomPanel.add(new Button("/", Metod.dev,this));


        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.setLayout(new BorderLayout());
        panel.add(topPanel, BorderLayout.NORTH);
        panel.add(bottomPanel, BorderLayout.CENTER);


        JFrame frame = new JFrame("CALC1.0");

        frame.setPreferredSize(new Dimension(260, 320));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
