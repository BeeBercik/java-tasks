package Swing.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class JScrollBarEx {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        JScrollBar scroll = new JScrollBar();
        scroll.setValue(30); // poczatkowe ustawienie suwaka
        scroll.setMaximum(100); // wyswietli 90 bo zajmuje scroll
        scroll.setMinimum(10); // min wartosc moze rzyjac 10 (na samej gorze nie 0 a 10)
        scroll.setPreferredSize(new Dimension(35, 170)); // szerokosc, wysokosc

        scroll.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                if(e.getValueIsAdjusting()) return;
                System.out.println("Scroll value: " + e.getValue());
            }
        });

        JScrollBar scrollHorizon = new JScrollBar(JScrollBar.HORIZONTAL);
        scrollHorizon.setValue(70);
        scrollHorizon.setMinimum(0);
        scrollHorizon.setMaximum(110);
        scrollHorizon.setPreferredSize(new Dimension(100, 20));

        scrollHorizon.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                if(e.getValueIsAdjusting()) return;
                System.out.println(e.getValue());
            }
        });

        frame.add(scroll);
        frame.add(scrollHorizon);
    }
}
