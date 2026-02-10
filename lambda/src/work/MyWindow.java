package work;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {

    public static void main(String[] args) {

        //window : object JFrame
        JFrame frame = new JFrame("My Window");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());


        //create button and add JFrame
        JButton button =new JButton("Click me !!");


//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button Clicked");
//                JOptionPane.showMessageDialog(null, "Hey, Button clicked");
//            }
//        });


        button.addActionListener((e) -> {
            System.out.println("Button Clicked");
            JOptionPane.showMessageDialog(null, "Hey, Button clicked");
        } );


        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
