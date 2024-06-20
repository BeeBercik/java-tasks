package MyTasks.palindrom;

public class Main {
    public static boolean palindromA(String word) {
        boolean palindrom = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if(word.charAt(i) != word.charAt(word.length() - 1 - i))
                palindrom = false;
        }
        return palindrom;
    }

    public static boolean palindromB(String word) {
        int x = 0;
        int y = word.length() - 1;
        boolean palindrom = true;
        while(x < y) {
            if (word.charAt(x) != word.charAt(y)) {
                palindrom = false;
            }
            x++;
            y--;
        }
        return palindrom;
    }

    public static void main(String[] args) {
        String word = "aa";
        boolean isPalindromA = Main.palindromA(word);
        boolean isPalindromB = Main.palindromB(word);
        System.out.println("Czy jest plaindromem metoda A: " + isPalindromA);
        System.out.println("Czy jest plaindromem metoda B: " + isPalindromB);
    }
}
