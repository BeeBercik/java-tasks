package Swing.components;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

// Uzuwajac DefaultTableModel konstruujac tabele mamy wiecej mozliwosci operacji naniej tj. p. dodawanie calych wierysz oraz ich usuwanie
// Lepiej z tego korzystac tzn stworzyc ten DefaultModel bo mamy wieksze pole do popisu i wiekszosc rzeczy wykonujemy na tym obiekcie modelu niz samej tablicy (na tablicy mozna ustawic pojedyncza wartosc - na modelu tez! Dodatkowo mozna cale wiersze wstawiac itd)

public class DefaultTableModelEx extends JFrame {
    public static void main(String[] args) {
        DefaultTableModelEx frame = new DefaultTableModelEx();
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
        DefaultTableModel model = new DefaultTableModel(data, columns);
        JTable table = new JTable(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        JScrollPane pane = new JScrollPane(table);
        pane.setPreferredSize(new Dimension(300, 100));

        frame.add(pane, BorderLayout.CENTER); // umieszczamy panewke scrolle nie tabele i w jakim obaszrze
        frame.pack();

//        Wstawiamy caly wiersz na konkretnej pozycji przekazujac tablice obiektow (bo Stringi, wynika z def. metody)
        model.insertRow(0, new Object[] {"69", "Venna", "Macrosy"});
        model.insertRow(model.getRowCount(), new String[] {"100", "Bigon", "Majak"});
        model.setValueAt("XXX", 2, 2);

//        LISTENER I ZAZNACZANIE POJEDYNCZEGO POLA
        table.setCellSelectionEnabled(true); // bo domyslnie zaznacza caly wiersz
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // mozna jedna komorke na raz

//          Aby miec mozliwosc zarzadzania zdarzeniami musimy ustawic listener na ListSelectionModel na basie naszego Modelu tabeli bo ListSelectionModel odnotowuje wszelkie zmiany w zaznaczeniu komorek i umowliwia dodanie listenera takiego jak np w listach JList
        ListSelectionModel listSelectionModel = table.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()) return; // prerwij, aby nie wypisalo ponizych instr. gdy przeciaga mysz
                int selectedRow = table.getSelectedRow();
                int selectedColumn = table.getSelectedColumn();
                System.out.println(model.getValueAt(selectedRow, selectedColumn));
            }
        });
    }
}
