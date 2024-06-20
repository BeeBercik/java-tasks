package Swing.components.JOptionPane;

// Okienko wymagajace potwirdzecnia od uzytkownika - tak, nie lub anuluj
// Wartosc ta jest przechowywana jako int (dezycja uzytkownika tzn opcje posiadaja swoje odpowiedniki int np. JOptionPane.YES_OPTION = 0

import javax.swing.*;

public class ShowConfirmDialog {
    public static void main(String[] args) {
        int result = JOptionPane.showConfirmDialog(
                null,
                "Czy zapisac dane?",
                "Dane zmienione",
                JOptionPane.YES_NO_CANCEL_OPTION
        );

        switch(result) {
            case JOptionPane.YES_OPTION:
                System.out.println("You said YES!");
                break;
            case JOptionPane.NO_OPTION:
                System.out.println("You said NO!");
                break;
            case JOptionPane.CANCEL_OPTION:
                System.out.println("Cancelled.");
                break;
        }
    }
}
