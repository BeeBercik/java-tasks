package Swing.components.JOptionPane;

// Jest to osobne okienko od glownego okna naeszej aplikacji
// Wyswietla jakis komunikat uzytkownikowi

import javax.swing.*;

public class ShowMessageDialog extends JFrame {
    public static void main(String[] args) {
        ShowMessageDialog frame = new ShowMessageDialog();
        frame.setSize(250, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

//        parentComponent (frame/null), message, title, type of window (error/plain - zwykla)
        JOptionPane.showMessageDialog(
                frame,
                "Hello World!",
                "Some Title",
                JOptionPane.PLAIN_MESSAGE
        );

        ImageIcon icon = new ImageIcon("auto.jpg");
        JOptionPane.showMessageDialog(
                null,
                "<html><i>Hey</i></html>",
                "Welcome",
                JOptionPane.ERROR_MESSAGE,
                icon
        );
    }
}
