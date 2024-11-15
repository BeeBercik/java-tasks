package Swing.listenery;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

// Pozwala podjac dzialania w zaleznosci od stanu zaznaczenia danych elementow (stale ItemEvent.SELECTED itd)
// Obsluguje CheckBoxy, ComboBox - ktore z el. zaznaczono..

public class ItemListenerEx {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        JComboBox<String> names = new JComboBox<>();
        names.addItem("Robert");
        names.addItem("Wera");
        names.addItem("Karol");
        names.setFont(new Font("Arial", Font.BOLD, 15));
        names.setPreferredSize(new Dimension(100, 100));

        names.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int state = e.getStateChange();
                if(state == ItemEvent.SELECTED)
                    System.out.println(e.getItem());
            }
        });

        frame.add(names);
    }
}
