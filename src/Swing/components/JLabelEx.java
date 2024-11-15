package Swing.components;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

// Jest to zwykla etykeita

// Aby 'po swojemu' pozycjonowac elementy trzeba na obiekcie okienka frame uzyc .setLayout(null). Wtedy wszystkie komponenty wewnatrz trzeba bedzi epozycjonowac reczie za pomoca funkcji .setBounds()!

public class JLabelEx extends JFrame {
    public static void main(String[] args) {
        JLabelEx frame = new JLabelEx();
        frame.setSize(250, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
// WYLACZA MENADZER LAYOUTU DLA CALEGO OKIENKA/KONTENERA - komponenty w srodku trzeba pozycjonowac recznie
        frame.setLayout(null);

//        ETYKIETA
        JLabel label = new JLabel("Etykieta");
        label.setText("<html>Hello world!</html>"); // mozna przekazac kod html
        label.setBounds(20, 20, 100, 60); // reczne pozycjonowanie i rozmiar
        label.setForeground(Color.BLUE); // ustawia kolor czcionki/'pierwszoplanowy'
        label.setFont(new Font("Arial", Font.ITALIC, 15)); // ustawia typ czcionki
        label.setOpaque(true); // nieprzezroczysta - tak
        label.setBackground(Color.WHITE); // tlo biale za napisem
//        Ustawia napis wewnatrz etykiety na srodku (w pionie i poziomie)
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
//      Mozna ustawic border ramki (na klasie BorderFactory odpowiednia metoda statyczna borderu)
        Border border = BorderFactory.createLineBorder(Color.RED, 3); // tworzy ramke wokol etykiety o grub. 3px
        label.setBorder(border);


        frame.add(label);
    }
}
