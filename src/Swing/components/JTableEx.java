package Swing.components;

import javax.swing.*;
import java.awt.*;

// Tabelki w swingu skladaja sie jakby z 2 czescie - kolumnt tytulowych oraz danych

public class JTableEx extends JFrame {
    public static void main(String[] args) {
        JTableEx frame = new JTableEx();
        frame.setSize(250, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        String[] columns = {"ID", "Name", "Category"};
        String[][] data = {
                {"1", "Robert", "IT"},
                {"2", "Weronika", "Buisness"},
                {"3", "Dwid", "Sport"}
        };

        JTable table = new JTable(data, columns);

//      Wylaczamy samo dopasowujaca sie wielkosc tabeli
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//        Opakowujemy tabele w scrollu jesli bedzie za duzo danych to pojawia sie paski do pezwijania
        JScrollPane pane = new JScrollPane(table);
        pane.setPreferredSize(new Dimension(300, 100)); // trzeb aprzekaza obiekt Dimension z wymiarami w konstr

        frame.add(pane, BorderLayout.CENTER); // umieszczamy panewke scrolle nie tabele i w jakim obaszrze
        frame.pack(); // sprawia ze elementy beda mial wyliczone elementy na podstawie naszego setPreferredSize()

        table.setValueAt("10", 0, 0);
        System.out.println(table.getValueAt(0, 1));
        System.out.println("Column name: " + table.getColumnName(0));
    }
}
