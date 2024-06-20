package Swing.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Najpierw tworzymy obiekt reprezentujacy pasek zakldake - glowny bra. Pozniej konkretne zakladki i do niego dodajemy. Podobnie z opcjami zakladek (itemami) - odajemy je do zakladek

public class JMenuBarEx extends JFrame {
    public static void main(String[] args) {
        JMenuBarEx frame = new JMenuBarEx();
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        // Glowne menu
        JMenuBar menuBar = new JMenuBar(); // tworzymy pasek na zakladki
        JMenu menuFile = new JMenu("File"); // towrzymy zakldake 'file'
        menuBar.add(menuFile); // dodajemy ja do paska

        JMenuItem newItem = new JMenuItem("New"); // tworzymy element zakldadki 'file'
        menuFile.add(newItem); // dodajemy go do zakladki
        JMenuItem addItem = new JMenuItem("Add");
        menuFile.add(addItem);

        JMenu menuEdit = new JMenu("Edit");
        JMenuItem cutItem = new JMenuItem("Cut");
        menuEdit.add(cutItem);
        JMenuItem copy = new JMenuItem("Copy");
        menuEdit.add(copy);

        // podmenu
        JMenu files = new JMenu("Latest");
        JMenuItem file1 = new JMenuItem("File1");
        JMenuItem file2 = new JMenuItem("File2");
        files.add(file1);
        files.add(file2);

        menuFile.add(files);
        // ostatnia opcja menu 'file' exit na koncu
        menuFile.addSeparator();
        JMenuItem exitItem = new JMenuItem("Exit");
        menuFile.add(exitItem);

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if(source.equals(exitItem))
                    System.exit(0); // wylaczy aplikacje jesli ni e ma bledu (0)
                if(source instanceof JMenuItem)
                    System.out.println(((JMenuItem) source).getText());
            }
        };
        exitItem.addActionListener(al);
        addItem.addActionListener(al);
        newItem.addActionListener(al);
        cutItem.addActionListener(al);
        file1.addActionListener(al);
        file2.addActionListener(al);

        frame.add(menuBar);
        menuBar.add(menuEdit);
    }
}
