import java.util.HashMap;

public class LetterCounter {
    public static HashMap<Character, Integer> countLetters(String string) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            try {
                map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
            } catch (NullPointerException e) {
                map.put(string.charAt(i), 1);
            }
        }
        return map;
    }
}
