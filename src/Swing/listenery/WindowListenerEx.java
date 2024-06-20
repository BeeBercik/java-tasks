package Swing.listenery;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// Interfejs ten usdotsepnia mase metod, ktore pozwalaja zareagowac m.in. na otwarcie, zakmniecie, minimalizowanie okna itd.
// Trzeba podobnie jak w ActionEvent (co_nasluchuje.addActionListener(do_kogo_info) wskazac ktora klasa/obiekt ma byc listenerem okno.addWindowListener(do_kogo_info).
// Podobnie z interf. FocusListener - ten dostarcza tylko 2 metody dot. focusu okienka

// Argumenty sa przekazywane automatycznie przez system - to zdarzenie/stan okienka

public class WindowListenerEx
extends JFrame
implements WindowListener,
        FocusListener {
    public static void main(String[] args) {
        WindowListenerEx frame = new WindowListenerEx();
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.addWindowListener(frame); // ustawiamy listenera na tej klasie
    }

    @Override
    public void focusGained(FocusEvent e) {
        System.out.println("Okno ma focus");
    }

    @Override
    public void focusLost(FocusEvent e) {
        System.out.println("Okno stracilo focus");
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Okno otwarte");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Okno zamykane");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Okno zamkniete");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Okno minimalicowane");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Okno powiekszone");

    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Okno aktywne");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Okno nieaktywne");
    }
}
