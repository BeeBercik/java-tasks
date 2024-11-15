package Swing.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

// Aby przechwycic dzialanie JCeckBoxa trzebauzyc .addItemListener() i przekaza klase impl. ten interfejs (lub klase anonimowa) impl. metode itemStateChanged(ItemEvent e) gdzie e tj ten checkbox przekazany automatycznie udostepnia nnam metode zwracajaca jego stan

// Mozemy stworzy klase implementujaca inter.f Icon (majaca 3 metody), na bazie ktorej stworzymy 3 ijej instancje reprezentujace 3 roznr stanny checkboxa (normal, rollover i selected) przekazujac rozne kolory itd do konstr klasy i ustawiajac je za pmoca checkbox.setSelected() itd - GLUPIE!

class MyFrame extends JFrame {}

class Check implements ItemListener {
    @Override
    public void itemStateChanged(ItemEvent e) {
        switch(e.getStateChange()) { // metoda zwraca STAN checkboxa
            case ItemEvent.SELECTED:
                System.out.println("Zaznaczono!");
                break;
            case ItemEvent.DESELECTED:
                System.out.println("Nie zaznaczono!");
                break;
        }
    }
}

public class JCheckBoxEx {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setSize(250, 250);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox checkBox = new JCheckBox("Opcja");
        checkBox.setSelected(true);
        checkBox.addItemListener(new Check());
        checkBox.setBounds(20, 20, 70, 50); // polozenie i wymairy kafelka z napisem opcji
        frame.add(checkBox);

//        CHECKBOX Z IKONAMI
        MyIcon normal = new MyIcon(Color.BLUE, "normal");
        MyIcon rollover = new MyIcon(Color.RED, "rollober");
        MyIcon selected = new MyIcon(Color.GREEN, "selected");
        JCheckBox checkIcon = new JCheckBox(normal);
        checkIcon.setRolloverIcon(rollover);
        checkIcon.setSelectedIcon(selected);

        checkIcon.setBounds(50, 50, 100, 50);
        frame.add(checkIcon);
    }
}

// CHECKBOXY Z IKONAMI
class MyIcon implements Icon {
    Color color;
    String text;

    public MyIcon(Color color, String text) {
        this.color = color;
        this.text = text;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.setColor(color);
        g.drawString(text, 20, 20);
    }

    @Override
    public int getIconWidth() {
        return 30;
    }

    @Override
    public int getIconHeight() {
        return 30;
    }
}
