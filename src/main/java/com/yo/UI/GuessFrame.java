package com.yo.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    //Fields
    JButton button= new JButton("Hi");
    JLabel label = new JLabel("Zzz.....");
    JTextField number = new JTextField(8);
    int secret = new Random().nextInt(10)+1;
    //Constructors
    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num =Integer.parseInt(number.getText());
                System.out.println(num);
                if(num>secret){
                    label.setText("Smaller");
                }else if(num<secret){
                    label.setText("Smaller");
                }else{
                    label.setText("Bingo, the secret number is"+ secret);
                }
//                label.setText("Hello!");
            }
        });
        setLayout(new FlowLayout());
        add(button);
        add(label);
        add(number);
        setVisible(true);
    }
    //Methods












    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
        //guessFrame.setSize(600,400);
        //guessFrame.setVisible(true);
    }
}
