package Swing.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

// Lista rozwijana (select w html)
// W Action Listenerze zmienna zdarzeniowa a jest referencja do samej listy select wiec bazujemy po prostu na naszej liscie a nie na zmiennej e dostarczanej automatycznie

// Mozna obsluzyc za pomoca ActionListener (tu po prostu robimy cos gdy zajdzie zdarzenie na naszym obiekcie) lub ItemListener (ten basuje na zmianie stanu trzeba wiec uwzgelednic stan jaki jest i w zaleznosci od niego podjac akcje)

public class JComboBoxEx extends JFrame {
    public static void main(String[] args) {
        JComboBoxEx frame = new JComboBoxEx();
        frame.setSize(250, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        String[] lang = {"php", "c++", "java"};
        JComboBox<String> cb = new JComboBox<>(lang); // przekazujac do konstr. przekazujemy opcje do listy
        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//             MOZEMY RUZTOWAC LUB DZIALAC NA NASZEJ
//                JComboBox<String> inner = (JComboBox<String>) e.getSource(); // to ta sama lista co nasza
//                System.out.println(inner.getSelectedItem());
//                System.out.println(inner.getSelectedIndex());
//             Prosciej dzialac na naszej - mniej rlboty z ruztowaniem itd
                System.out.println(cb.getSelectedItem()); // zwraca el. obj konwertowany do String (czyli nasz napis)
                System.out.println(cb.getSelectedIndex()); // zwraca index z tablicy opcji
            }
        });

        cb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int state = e.getStateChange(); // zwraca int np 1 to selected, 2 to deselected itd..
                if(state == ItemEvent.SELECTED) {
                    System.out.println("Zaznaczono -> " + e.getItem());
                } else if(state == ItemEvent.DESELECTED) {
                    System.out.println("Odznaczono -> " + e.getItem());
                }
            }
        });

        frame.add(cb);
        frame.setLayout(new FlowLayout());
    }
}
