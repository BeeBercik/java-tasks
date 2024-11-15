package Swing.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// Klasa abstr. MouseAdapter impl. interfejs MouseListener i wiele innych ,przez co dostarcza wiele przydatnych metoddo obslugi/nasluchiwania zdarzen myszy (wiecej niz sam interf. MouseListener)
// !ORAZ! w przeciwinstwie od niego umozliwia zaimplementowanie tylko potrzebnych metod (interf. MouseListener po zaimpl. wymaga wszystkich 4 metod nadpisanych) a MouseAdapter dostarcza puste implementacje wszystkich metod wiec nie trzeba marnowac na nie miejsca

public class JPopupMenuEx extends JFrame {
    public static void main(String[] args) {
        JPopupMenuEx frame = new JPopupMenuEx();
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        JPopupMenu popupMenu = new JPopupMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        popupMenu.add(cut);
        popupMenu.add(copy);
        popupMenu.add(paste);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JMenuItem item = (JMenuItem) e.getSource();
                System.out.println(item.getText());
//                System.out.println(((JMenuItem) e.getSource()).getText()); // to samo
            }
        };

        cut.addActionListener(listener);
        copy.addActionListener(listener);
        paste.addActionListener(listener);

//        do MouseListenera przekazujemy obiekt klasy impl. ten itnerfejs posiadajacą mase funkcji do obslugi zdarzen myszy. My korzystamy z klikniecia, gdy ono zajdzie wywolujemy nasze popupMenu za pomoca metody .show() przekazujac gdzie sie ma ono pojawic i w jakiej pozycji
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                popupMenu.show(frame, e.getX(), e.getY());
            }
        });

    }
}
