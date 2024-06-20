package Swing.components.JOptionPane;

import javax.swing.*;

// Pobiera dane od uzytkownika ktore mozna zapisac do zmiennej np String/int

public class ShowInputDialog {
    public static void main(String[] args) {
        String res = JOptionPane.showInputDialog(null, null, "Jak sie masz", JOptionPane.PLAIN_MESSAGE);
        System.out.println("Jak sie masz? " + res);

        String[] names = {"Robert", "Weronika", "Karol"};
        // rodzic/wlasciciel (okno do ktorego bedzie nalezec to okno) - wiadomosc - tytul - rodzaj - ikona - tab. opcji - wart. poczatkowa
        String result = (String) JOptionPane.showInputDialog(null, "Podaj imie", "Przedstawienie", JOptionPane.QUESTION_MESSAGE, null, names, names[0]);
        System.out.println("Imie: " + result);
    }
}
