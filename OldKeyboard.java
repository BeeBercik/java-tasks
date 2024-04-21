package ZONE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OldKeyboard {
    static String encode(HashMap<Integer, ArrayList<Character>> keyboard, String word) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            for(Map.Entry<Integer, ArrayList<Character>> keys : keyboard.entrySet()) {
                ArrayList<Character> list = keys.getValue();
                if(list.contains(letter)) {
                    for(Character letterInside : list) {
                        if(letterInside != letter) {
                            result.append(keys.getKey());
                        } else {
                            result.append(keys.getKey());
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
        keyboard.put(2, new ArrayList<>(Arrays.asList('A', 'B', 'C')));
        keyboard.put(3, new ArrayList<>(Arrays.asList('D', 'E', 'F')));
        keyboard.put(4, new ArrayList<>(Arrays.asList('G', 'H', 'I')));
        keyboard.put(5, new ArrayList<>(Arrays.asList('J', 'K', 'L')));
        keyboard.put(6, new ArrayList<>(Arrays.asList('M', 'N', 'O')));
        keyboard.put(7, new ArrayList<>(Arrays.asList('P', 'Q', 'R', 'S')));
        keyboard.put(8, new ArrayList<>(Arrays.asList('T', 'U', 'V')));
        keyboard.put(9, new ArrayList<>(Arrays.asList('W', 'X', 'Y', 'Z')));

        String word = "pies".toUpperCase();
        String result = OldKeyboard.encode(keyboard, word);

        System.out.println("'" + word + "'" + " in number format: " + result);
    }
}
