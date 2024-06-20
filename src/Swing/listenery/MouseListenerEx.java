package Swing.listenery;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseListenerEx extends JFrame implements MouseListener {
    public static void main(String[] args) {
        MouseListenerEx frame = new MouseListenerEx();
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // nasluchuj obiekt z mouse klikera i info wysylaj do w tym wypadku rowneiz tego obiektu
        frame.addMouseListener(frame);

        //dla cwiczen zamiast impl. jak poprzednio to anonimową klasą z przypisaniem do zmiennej
        MouseMotionListener mml = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("Przeciagnieto");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("Poruszono");
            }
        };
//        frame.addMouseMotionListener(mml);
//        LUB od razu
            frame.addMouseMotionListener(new MouseMotionListener() {
                @Override
                public void mouseDragged(MouseEvent e) {
                System.out.println("Przeciagnieto"); // LPM + ruszanie
                }

                @Override
                public void mouseMoved(MouseEvent e) {
                System.out.println("Poruszono");
                }
            });
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Kliknieto, X:" + e.getX() + " Y:" + e.getY());
        System.out.println("Ilosc klikniec: " + e.getClickCount());
        System.out.println("Kliknieto wzgledem ekranu, X:" + e.getXOnScreen() + " Y:" + e.getYOnScreen());
        System.out.println("Przycisk nr " + e.getButton());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Nacisnieto");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Opuszczono");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Wejscie myszy w okno");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Wyjscie myszy z okna");
    }
}
