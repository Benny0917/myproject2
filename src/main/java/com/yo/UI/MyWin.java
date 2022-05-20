package com.yo.UI;

import javax.swing.*;
import javax.xml.transform.OutputKeys;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.http.WebSocket;

public class MyWin {
    public static void main(String[] args) {
        //swing, SWT,JavaFX
        //extension
        JFrame frame = new JFrame();
        frame.setSize(600,400);
        frame.setLocation(300,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        MyActionListener listener = new MyActionListener();
        //add Component
        //frame.setLayout(new BorderLayout());
        frame.setLayout(new FlowLayout());
        JButton button = new JButton("Test");
        frame.add(button);
        frame.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event){ {
                System.out.println("Hi");
                }
            }
        });
    }
}
