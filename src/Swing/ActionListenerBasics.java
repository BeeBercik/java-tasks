package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Mozemy stworzyc przyciski w naszym okienku jframe oraz obsluzyc je imlpementujac interfejs ActionListener. W ten spososb klasa bedzie musiala zaimplementowac metode actionPerformed, ktora przyjmuje obiekt, ktory zostal kliekniety. Mozeym wtedy porownac zwrocony obiekt z naszym stworzonym i dla konkrentych buttonow podjac rozne dzialania.
// Tworzac buttony trzeba za pomoca .addActionListener() wskazac klase, ktora ma dostawac info od tych przyciskow. (Oczywscie przyciski trzeba dodac .add() do naszego okienka okienko.add(element)

// DLA KAZDEGO .ADDCOSLITENER()
// addCosLisstener() zawsze wywolujemy na naszym okienku aby przechwycilo jakas czynnosc, na nim bedzie listener (bedzie sluchac). W konstruktorze przekazujemy obiekt ktory ma odebrac info.
//  okienko_z_listenerem.addCosListener(obiekt_przechwytujacy_info_o_zdarzeniu_z_okienka)

//PRZYKLAD Z OSOBNYM OKIENKIEM I KLASA ZARZADZAJACA BUTTONAMI
class MyWindow extends JFrame {
    JButton button1;
    JButton button2;

    public void initUI() {
        this.setLayout(new GridLayout()); // sprawdzia ze sa obok siebie

        button1 = new JButton("Click me!");
        button1.addActionListener(new ButtonManager(this)); // wskazuje kto otrzyma inf o przycisku jednoczesnie przekazujac swoj obiekt (siebie, bo ta konkretna instancja ma te przyciski)
        this.add(button1); // dodanie przycisku do okienka

        button2 = new JButton("Me too!");
        button2.addActionListener(new ButtonManager(this));
        this.add(button2);
    }
}

class ButtonManager implements ActionListener {
    MyWindow window;
// Musimy dostarczyc instancje window, ktora ma te przyciski bo gdybysmy stworzyli nowy obiekt nie byloby reakcji!
    public ButtonManager(MyWindow window) {
        this.window = window;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.window.button1.equals(e.getSource()))
            System.out.println("Button 1 klik!");
        else if(this.window.button2.equals(e.getSource()))
            System.out.println("Button 2 klik!");
    }
}

public class ActionListenerBasics {
    public static void main(String[] args) {
//        MyWindow mw = new MyWindow();
//        mw.setSize(300, 300);
//        mw.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        mw.setVisible(true);
//        mw.setLocationRelativeTo(null);
//
//        mw.initUI(); // nasza metoda tworzaca buttony i przypisujaca im obsluge zdarzen

        AllIn ai = new AllIn();
        ai.setSize(200, 200);
        ai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ai.setVisible(true);
        ai.setLocationRelativeTo(null);

        ai.assign();
    }
}

//PRZYKLAD Z KLASA REPREZENT. OKIENKO I ZARZADZAJACA BUTTONAMI
 class AllIn extends JFrame implements ActionListener {
    JButton button1;
    JButton button2;

    public void assign() {
        this.setLayout(new GridLayout());

        button1 = new JButton("1");
        button1.addActionListener(this);
        this.add(button1);

        button2 = new JButton("2");
        button2.addActionListener(this);
        this.add(button2);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.button1.equals(e.getSource()))
            System.out.println("1 click");
        else if(this.button2.equals(e.getSource()))
            System.out.println("2 click");
    }
}
