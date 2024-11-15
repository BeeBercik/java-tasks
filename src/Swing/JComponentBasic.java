package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

// Okienko tworzymy tak: tworzymy klase (mozna osobna lub taka w ktorej jest f. main()) i rozszerzamy klaee JFrame. Wtedy klasa ta reprezentuje nasza aplikacje okienkowa
// Mozna rowniez zinstancjonowc bezposrednio Jframe, nie tworzac klasy dziedzicacej

// Wewnatrz aplikacji okienkowych JFrame mozemy umieszac nasze niestandardowe komponenty - musza dziedziczyc/rozszerzac JComponent i nadpisywac metode paintComponent(), ktora sprawia, ze ten komponent jest widoczny (nie wywolujemy jej na obiekcie tej klasy!! Java sama ja uruchamia gdy np. minimalizujemy i powiekszamy spowrotem okno!)

// Komponent moze rysowac ksztalty, pisac text a to wszystko my implementujemy bazujac na obiekcie Graphic (przekazywanym automatyczine przez ysstem) lub jego nowszym odpowiedniuku Grapgics2D

class MyJComponent extends JComponent {
    Image img;

    public MyJComponent() {
//        super();
        img = new ImageIcon("auto.jpg").getImage();
    }

    // Graphics to klasa posiadajaca metody sluzece do np. zmienianai koloru, tekstu na powierzchni okienka. System sam dotarcza ta zmienna, gdy wywoluje automatycznie metode, my za je pomoca tylko modyfikujemy nasz komponent.
    public void paintComponent(Graphics g) {
        g.setColor(Color.GREEN); // ustawia globalny kolor
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.drawString("Przykładowy tekst", 30, 10);

        g.fillRect(50, 50, 80, 30); // maluje/rysuje i wypelnia obecnie ustawionym kolorem
        Graphics2D g2d = (Graphics2D) g; // konwertujemy obiekt Graphiics na jego nowsza wersje (ma wiecej metod)
        g2d.drawImage(img, 100, 100, 150, 150, this);

        g2d.setColor(Color.BLACK);
//        .draw() rysuje tylko ksztalty (bez wypelnienia) - BRAK W STARYM GRAPHICS. Przekazujemy Obiekt2D.float() przekazujac wspolrzedne danymi Float
        g2d.draw(new Line2D.Float(0.0f, 10.9f, 220.0f, 200.5f));
        g2d.draw(new Rectangle2D.Float(20.0f, 20.0f, 50.0f, 100.0f));
        g2d.draw(new Ellipse2D.Float(200.0f, 200.9f, 50.0f, 80.0f));
    }
}

public class JComponentBasic extends JFrame {
    public static void main(String[] args) {
        JComponentBasic frame = new JComponentBasic();
        MyJComponent myComp = new MyJComponent();
        frame.add(myComp); // nasze_okienko.add(komponent)

        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // co gdy user kliknie X - zamknij
        frame.setVisible(true); // ustawia, ze jest widoczne
        frame.setLocationRelativeTo(null); // ustawia pozycje okna w stosunku do jego rodzica (null tj sordek)
    }
}
