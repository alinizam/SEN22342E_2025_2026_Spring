package Week09Theory.ObserverJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {
    static void main() {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        JButton button1=new JButton("Button1");
        button1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button1 clicked");
            }
        });

        JButton button2=new JButton("Button2");
        button2.addActionListener((evt)->System.out.println("Button2 clicked"));
        JButton button3=new JButton("Button3");

        ActionListener lstnr=(evt)->System.out.println(((JButton)evt.getSource()).getText()+"Button clicked");
        button3.addActionListener(lstnr);
        JButton button4=new JButton("Button4");
        button4.addActionListener(lstnr);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.pack();
    }
}
