package Swing.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Wbudowany component, przycisk

// Aby 'po swojemu' pozycjonowac elementy trzeba na obiekcie okienka frame uzyc .setLayout(null). Wtedy wszystkie komponenty wewnatrz trzeba bedzi epozycjonowac reczie za pomoca funkcji .setBounds()!
// Nie jest to polecane!!

public class JButtonEx extends JFrame {
    public static void main(String[] args) {
        JButtonEx frame = new JButtonEx();
        frame.setSize(250, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

//        PRZYCISK
        JButton button = new JButton("Przycisk");
        button.setBounds(30, 30, 100, 80); // podajem wspolrzedne i wymiary (bo nie dalismy lyoutu)
        button.setFont(new Font("Arial", Font.BOLD, 13));
        button.setText("Button 1"); // inna metoda przekazania txt

        button.addActionListener(new ActionListener() { // anonimowa klasa aby osobnej specjalnie do obsl. nie tworzyc
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Klik");
            }
        });
        frame.add(button);

    }
}
