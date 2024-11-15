package Swing.listenery;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import java.awt.*;

public class DocumentListenerEx implements DocumentListener {
    @Override
    public void insertUpdate(DocumentEvent e) {
        try {
            System.out.println("Wstawiono cos, obecny txt: " +
                    e.getDocument().getText(0, e.getDocument().getLength()));
        } catch (BadLocationException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        System.out.println("Usunieto cos");
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        System.out.println("Zmieniono cos");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());


        JTextArea tArea = new JTextArea(10, 20);
        tArea.setLineWrap(true);
        tArea.getDocument().addDocumentListener(new DocumentListenerEx());

        frame.add(tArea);
    }
}
