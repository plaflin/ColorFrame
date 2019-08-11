package com.patricklaflin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorFrame extends JFrame {
    JButton red, green, blue;

    public ColorFrame() {
        super("ColorFrame");
        setLookAndFeel();
        setSize(322,122);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        red = new JButton("Red");
        add(red);
        green = new JButton("Green");
        add(green);
        blue = new JButton("Blue");
        add(blue);
        // begin anonymous inner class
        ActionListener act = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == red) {
                    getContentPane().setBackground(Color.RED);
                }
                if(e.getSource() == green) {
                    getContentPane().setBackground(Color.GREEN);
                }
                if(e.getSource() == blue) {
                    getContentPane().setBackground(Color.BLUE);
                }
            }
        };
        // end anonymous inner class
        red.addActionListener(act);
        green.addActionListener(act);
        blue.addActionListener(act);
        setVisible(true);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            // ignore error
        }
    }

    public static void main(String[] args) {
        new ColorFrame();
    }
}
