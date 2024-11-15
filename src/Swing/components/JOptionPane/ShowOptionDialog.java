package Swing.components.JOptionPane;

import javax.swing.*;

public class ShowOptionDialog {
    public static void main(String[] args) {
        String[] options = {"save", "send", "cancel", "miss"};
//     to DEFAULT_OPTION oznacza, ze gdy user ie wybeirze nic i zamknie okno to zostanie zwrocne -1
        int result = JOptionPane.showOptionDialog(
                null,
                "What do you want to do?",
                "Question",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        System.out.println(result);

//      PRZYKLAD Z WIADOMOSCIA EMAIL
        JTextArea area = new JTextArea(5, 10); // przekazemy jako tresc wiadomosci
        JTextField field = new JTextField(15); // jako pole dla email

        Object[] objOptions = {
                new JLabel("E-mail"),
                field,
                "Send",
                "Cancel"
        };

        int ressult2 = JOptionPane.showOptionDialog(
                null,
                area,
                "Zapytanie",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                objOptions,
                objOptions[0]
        );

        System.out.println("Tresc: " + area.getText());
        System.out.println("E-mail: " + field.getText());
        System.out.println("Result2: " + ressult2);
    }
}
