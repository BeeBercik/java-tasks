package Swing.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Zwykly radio button sluzycy do wybrania 1 opcji z kilku
// Nalezy stworzyckilka takich buttonow a nastepnie grupe i do niej dodac te przyciski aby moc zaznaczyc tylko JEDEN

public class JRadioButtonEx extends JFrame {
    public static void main(String[] args) {
        JRadioButtonEx frame = new JRadioButtonEx();
        frame.setSize(250, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JRadioButton b1 = new JRadioButton("Radio 1");
        JRadioButton b2 = new JRadioButton("Radio 2");

//        Aby moc wybrac tylko 1 button trzeba stworzyc grupe i je do niej dodac
        ButtonGroup group = new ButtonGroup();
        group.add(b1);
        group.add(b2);

//        Tworze anonimowa klase impl. interf. ActionListene ri przypisuje do zmiennej aby ja kilka razy uzyc
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//          Mteoda .getText() pobiera text a przycisku ALE jest udostepniana przez m.in. klase JRadioButton dlatego, gdy mtoda .getSource() zwraca Object trzeba rzutowac na ta klase (rzutujemy obiekt zdarzenia e na obiekt typu JRadioButoon dzieki czemu mozemy z przekazanego obj. zdarzenia pobierac text
//          ZAMIAST sprawdzac, ktory zostal wcisniety i pobierac ze stworzonego przez nas text (nizej)
                JRadioButton b = (JRadioButton) e.getSource();
                System.out.println(b.getText());
                System.out.println("Czy zaznaczono button1: " + b1.isSelected());
                System.out.println("Czy zaznaczono button2: " + b2.isSelected());

//                LUB mozna manualnie sprawdzic, ktory zostal wcisneity (bez rzutowania) i w kazdym przypadku dowolujac sie do naszego JRadioButtona wykonywac metody (MNIEJ ELASTYCZNE)
                if(b1.equals(e.getSource())) // nie trzeba rzutowac bo sprawdza referencje obiektow
                    System.out.println("Klinieto b1" + b1.getText());
                else if(b2.equals((e.getSource())))
                    System.out.println("Kliknieto b2");
            }
        };
        b1.addActionListener(actionListener);
        b2.addActionListener(actionListener);

        frame.setLayout(new FlowLayout());
//        Dodajemy je OSOBNO jako componenty a nie np. grupe z nimi!
        frame.add(b1);
        frame.add(b2);
    }
}
