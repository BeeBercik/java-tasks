package Swing.listenery;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

// Uzywany przy listach chocby JList (przy obsludze zaznaczannych opcji WARTO dodac sprawdzenie .getValueIsAdjusting(), ktore sprawdza czy opcja, ktorej stan sie zmienia nie jest "w trackie" zaznaczania - zostaje zwrocony obiekt ListSelectionEvent podczas ncisniecia jakiejs opcji i zwolnienia przycisku myszy - 2x)

class ListManager implements ListSelectionListener {
    @Override
    public void valueChanged(ListSelectionEvent e) {
        JList<Integer> list = (JList<Integer>) e.getSource();
        if(!list.getValueIsAdjusting())
            System.out.println(list.getSelectedValue());
    }
}

public class ListSelectionListenerEx {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        DefaultListModel<Integer> model = new DefaultListModel<>();
        model.addElement(10);
        model.addElement(20);
        model.addElement(30);
        JList<Integer> ages = new JList<Integer>(model);
        ages.setPreferredSize(new Dimension(50, 50));

        ages.addListSelectionListener(new ListManager());

        frame.add(ages);
    }
}

