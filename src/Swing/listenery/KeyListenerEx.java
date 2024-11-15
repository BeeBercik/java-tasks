package Swing.listenery;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerEx extends JFrame implements KeyListener {
    public static void main(String[] args) {
        KeyListenerEx frame = new KeyListenerEx();
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.addKeyListener(frame);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Wpisano " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Nacisnieto " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Zwolniono " + e.getKeyChar());
    }
}
