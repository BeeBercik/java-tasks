package Swing.components;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.Arrays;
import java.util.Collections;

// Nie jest rozwijana jak JComboBox (lista select). Od razu jest rozwinieta na maxa ORAZ w przeciwienstwie do JCombboBox (listy select) MOZNA zaznaczyc wiecej niz jeden element!

// Aby uwtorzyc liste (najczsciej przechowujaca String) najpier twrzeba stworzyc obiekt taki "model" klasy DefaultListModel<String> z typem elementow. Za pomoza .addElement() dodaje sie elementy. I na podstawie tego obiektu tworzy sie JListe (przekazujac ten model do konstr)

// Aby pobrac element trzeba z listy pobrac nasz model i z niego dopiero element podajac jego index

public class JListEx extends JFrame {
    public static void main(String[] args) {
        JListEx frame = new JListEx();
        frame.setSize(250, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        DefaultListModel<String> model = new DefaultListModel<>();
        model.addElement("php");
        model.addElement("c++");
        model.addElement("javaScript");

        JList<String> list = new JList<>(model);
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
//                Eliminuje/pomija efekt przeciagania mysza po elementach ORAZ eliminuje problem podwojnego wypisania zaznaczonego elementu (bo w trakcie - gdy wciska przycisk i puszcza wypisuje)
                 if(e.getValueIsAdjusting()) return;
                 int[] indices = list.getSelectedIndices(); // zwraca tab. indexow zaznaczonych elementow
//                tworzymy strumien na tablicach przekazujac nasza i w petli foreach metoda lambda z naszej listy pobieramy model a z niego konkrenty elementy (podajac jego inde)
                Arrays.stream(indices).forEach(i -> System.out.println(list.getModel().getElementAt(i)));
            }
        });

        frame.add(list);
        frame.setLayout(new FlowLayout());
    }
}
