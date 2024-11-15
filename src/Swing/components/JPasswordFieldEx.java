package Swing.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class PassManager implements ActionListener {
    JPasswordField passwordField;

    public PassManager(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        .getPassword() wraca tab. charow wiec tworzymy nowego Stringa z tą tab.
        System.out.println(new String(passwordField.getPassword()));
    }
}

public class JPasswordFieldEx extends JFrame {
    public static void main(String[] args) {
        JPasswordFieldEx frame = new JPasswordFieldEx();
        frame.setSize(250, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        JPasswordField jp = new JPasswordField(5); // 5 znakow max
// do konstr. przekazuje ref. obiektu by na nim dzialac tzn dzialac na obiekcie hasla a nie np tablice
        jp.addActionListener(new PassManager(jp));

        frame.add(jp);
    }
}
