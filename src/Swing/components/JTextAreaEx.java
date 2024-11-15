package Swing.components;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

// To textarea taka jak chocby w htmlu, mozna ustawic aby wiersze sie zajiwyaly, lub ustawic abypo przekroczeniu textarea pojawil sie scroll

// Aby osbluzyc zdarzenia w text area takie jak dodanie tekstu, usuniecie trzeba na naszym textare uzyc metody .getDocument() zwracajacej nasza textaree w formacie Documentu i na nim ustawic addDocumentListener() ktory ma 3 metody

// Pracujemy bezposreenidnio na JTextArea, gdy chcemy zmienic interfejs usera tj. jakies style, ustawienie textu (fonta). Mozemy rowniez dodawac i usuwac text itd. Na obiekcie Document z np. .getDocument() pracujemy gdy chcemy obsluzyc np zmiany w jtextarea ze zmiennej e (DocumentListener e pobieramy Document, tkory bedzie a Documentem naszej jtextarea i rownei zmozemy wstawiac, usuwac itd. Prosciej bazowac na jtextarea

public class JTextAreaEx extends JFrame {
    public static void main(String[] args) {
        JTextAreaEx frame = new JTextAreaEx();
        frame.setSize(250, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JTextArea textArea = new JTextArea(3, 14); // wielkosc 3 wierzy i 14 kolumn
        textArea.setText("Lorem Ipsum");
//        Przekazujac obiekt neszego textarea do JScrollPane sprawi to ze gdy przekroczymy domyslna wielkosc textarea pojawia sie scrolle
        JScrollPane scroll = new JScrollPane(textArea);

        textArea.append("KONIEC"); // dodaje na koncu tresci
        textArea.insert("Hello, ", 0); // dodaje na okreslona pozycje
        textArea.setLineWrap(true);

        frame.add(scroll);
        frame.setLayout(new FlowLayout()); // Musy byc bo domyslnie BorderLayout ktory rozciaga na cale okno

//        Zwraca obiekt impl. interfejs Document na ktorym (obiekcie) ustawiamy DocumentListenera
        textArea.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("Wstawiono cos: " + textArea.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("Usunieto cos");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                System.out.println("Zmieniono cos w dokumencie:  " + textArea.getText());
            }
        });
    }
}
