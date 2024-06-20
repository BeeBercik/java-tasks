package MyTasks.graWkosci;

import java.util.Random;

public class Bones {
    public static void main(String[] args) {
        byte max = 30;
        byte firstPlayer = 0;
        byte secondPlayer = 0;
        Random random = new Random();
        byte whoThrows = (byte) (random.nextInt(2) + 1);
        byte quantity = 2;

        byte round = 1;
        System.out.println("--Zaczyna gracz nr " + whoThrows + "--\n");
        while(firstPlayer < max && secondPlayer < max) {
            if(whoThrows % 2 == 0) {
                byte playerResultInRound = 0;
                for (int i = 0; i < quantity; i++) {
                    byte thrown = (byte) (random.nextInt(6) + 1);
                    playerResultInRound += thrown;
                    System.out.println("Gracz 2 rzuca za " + thrown);
                }
                System.out.println("Wynik po " + round + " rundzie: " + playerResultInRound);
                secondPlayer += playerResultInRound;
                System.out.println("Calkowity wynik 2 gracza: " + secondPlayer + "\n");
            } else {
                byte playerResultInRound = 0;
                for (int i = 0; i < quantity; i++) {
                    byte thrown = (byte) (random.nextInt(6) + 1);
                    playerResultInRound += thrown;
                    System.out.println("Gracz 1 rzuca za " + thrown);
                }
                System.out.println("Wynik po " + round + " rundzie: " + playerResultInRound);
                firstPlayer += playerResultInRound;
                System.out.println("Calkowity wynik 1 gracza: " + firstPlayer + "\n");
            }
            whoThrows++;
            round++;
        }

        System.out.println("--WYNIKI--");
        System.out.println("Pierwszy gracz: " + firstPlayer);
        System.out.println("Drugi gracz: " + secondPlayer);
        System.out.println(
                firstPlayer > secondPlayer ? "Wygrywa gracz nr 1, gratulacje!" : "Wygrywa gracz nr 2, gratulacje!"
        );
    }
}
