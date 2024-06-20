package MyTasks.Ants;

import java.util.ArrayList;


class Ant implements Runnable {
    private Board board;
    private int x;
    private int y;

    public Ant(Board board, int x, int y) {
        this.board = board;
        this.x = x;
        this.y = y;
    }

    private void move() {
        synchronized(this) {
            int oldX = this.x;
            int oldY = this.y;
            int jumpToX = (int) (Math.random() * 3) + this.x - 1;
            int jumpToY = (int) (Math.random() * 3) + this.y - 1;
            this.x = jumpToX;
            this.y = jumpToY;


            System.out.println("Ant's name: " + Thread.currentThread().getName());
            if((this.x < 0 || this.x > board.getGameSize() - 1) || (this.y < 0 || this.y > board.getGameSize() - 1)) {
                this.deathAndBorn(oldX, oldY);
                return;
            }

            if(board.getCell(this.x, this.y).equals(".")) {
                System.out.println("Ant at (" + oldX + ", " + oldY + ") moves to (" + this.x + ", " + this.y + ").");
                board.setCell(oldX, oldY, ".");
                board.setCell(this.x, this.y, "8");
            } else if(board.getCell(jumpToX, jumpToY).equals("8")) {
                System.out.println("Ant at (" + this.x + ", " + this.y + ") stays at her position.");
            }

            board.printBoard();
            System.out.println();
            try {
                long time = (long) (Math.random() * 3000) + 2000;
                Thread.sleep(time);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void deathAndBorn(int oldX, int oldY) {
        synchronized(this) {
            while((this.x < 0 || this.x > board.getGameSize() - 1) || (this.y < 0 || this.y > board.getGameSize() - 1)) {
                int newX = (int) (Math.random() * 3) + this.x - 1;
                int newY = (int) (Math.random() * 3) + this.y - 1;
                this.x = newX;
                this.y = newY;
            }
            System.out.println("Ant at (" + oldX + ", " + oldY + ") dies, new ant at (" + this.x + ", " + this.y + ").");

            board.setCell(oldX, oldY, ".");
            board.setCell(this.x, this.y, "8");
            board.printBoard();
            try {
                long time = (long) (Math.random() * 3000) + 2000;
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        while(true) {
            this.move();
        }
    }
}

class Board {
    private int gameSize;
    private Cell[][] board;

    public Board(int gameSize) {
        this.gameSize = gameSize;
        this.board = new Cell[gameSize][gameSize];
    }

    private class Cell {
        String value;

        public Cell(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }

    public void setCell(int x, int y, String value) {
        Cell cell = new Cell(value);
        this.board[x][y] = cell;
    }

    public String getCell(int x, int y) {
        return this.board[x][y].getValue();
    }

    public void fillBoard() {
        for (int i = 0; i < this.gameSize; i++) {
            for (int j = 0; j < this.gameSize; j++) {
                this.setCell(i, j, ".");
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < this.gameSize; i++) {
            for (int j = 0; j < this.gameSize; j++) {
                System.out.print(this.getCell(i, j));
            }
            System.out.println();
        }
    }

    public int getGameSize() {
        return this.gameSize;
    }
}

public class Ants {
    public static void main(String[] args) throws InterruptedException {
        int gameSize = 10;
        int startAntCount = 5;

        Board board = new Board(gameSize);
        board.fillBoard();

        ArrayList<Thread> ants = new ArrayList<>();
        int cond = 0;
        while(cond < startAntCount) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);

            if(board.getCell(x, y).equals("8")) continue;
            board.setCell(x, y, "8");

            Thread ant = new Thread(new Ant(board, x, y), "Ant" + cond);
            ants.add(ant);
            cond++;
        }

        System.out.println("-STARTED BOAR-");
        board.printBoard();
        for (int i = 0; i < startAntCount; i++) {
            ants.get(i).start(); // procek na podstawie czasu dostepu przydziela watki
            Thread.sleep(1000);
        }

    }
}
