package Swing.listenery;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Obsuguje JButton, JRadioButton, JComboBox, JPassword

class MyListener implements ActionListener {
    JButton button1;

    public MyListener(JButton button) {
        button1 = button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(button1.equals(e.getSource()))
            System.out.println("Klik");
    }
}

public class ActionListenerEx extends JFrame {
    public static void main(String[] args) {
        ActionListenerEx frame = new ActionListenerEx();
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Przycisk1");
        button.addActionListener(new MyListener(button));

//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Klik");
//            }
//        });

        frame.add(button);
    }
}
