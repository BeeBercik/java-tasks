package MyTasks.oldKeyboradNokia;

import java.util.*;

class IncorrectTextGiven extends Exception {
    public IncorrectTextGiven(String message) {
        super(message);
    }
}

public class OldKeyboard {
    static String encode(HashMap<Integer, ArrayList<Character>> keyboard, String text) throws IncorrectTextGiven {
        if(text == null || text.isEmpty()) throw new IncorrectTextGiven("Given text is incorrect!");

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            for(Map.Entry<Integer, ArrayList<Character>> buttons : keyboard.entrySet()) {
                ArrayList<Character> list = buttons.getValue();
                if(list.contains(letter)) {
                    for(Character letterInside : list) {
                        if(letterInside != letter) {
                            result.append(buttons.getKey());
                        } else {
                            result.append(buttons.getKey());
                            break;
                        }
                    }
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        HashMap<Integer, ArrayList<Character>> keyboard = new HashMap<>();
        keyboard.put(0, new ArrayList<>(List.of(' ')));
        keyboard.put(1, new ArrayList<>(List.of('.')));
        keyboard.put(2, new ArrayList<>(Arrays.asList('A', 'B', 'C')));
        keyboard.put(3, new ArrayList<>(Arrays.asList('D', 'E', 'F')));
        keyboard.put(4, new ArrayList<>(Arrays.asList('G', 'H', 'I')));
        keyboard.put(5, new ArrayList<>(Arrays.asList('J', 'K', 'L')));
        keyboard.put(6, new ArrayList<>(Arrays.asList('M', 'N', 'O')));
        keyboard.put(7, new ArrayList<>(Arrays.asList('P', 'Q', 'R', 'S')));
        keyboard.put(8, new ArrayList<>(Arrays.asList('T', 'U', 'V')));
        keyboard.put(9, new ArrayList<>(Arrays.asList('W', 'X', 'Y', 'Z')));

        try {
            String text = "".toUpperCase();
            String result = OldKeyboard.encode(keyboard, text);
            System.out.println("'" + text + "'" + " in number format: " + result);
        } catch (IncorrectTextGiven e) {
            System.out.println(e.getMessage());
        }
    }
}
