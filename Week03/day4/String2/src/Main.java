public class Main {

    public static void main(String[] args) {
        // Given a string, compute recursively a new string where all the 'x' chars have been removed.
        System.out.println(changeXToY("xyxasdxyxyxkekxy"));
    }

    public static String changeXToY(String s) {
        String changed = "";
        if (s.length() == 0) {
            return "";
        } else if (s.length() == 1 && s.charAt(0) == 'x') {
            return changed;
        } else if (s.length() == 1) {
            changed += s.charAt(0);
            return changed;
        } else if (s.charAt(s.length() - 1) == 'x') {
            return changeXToY(s.substring(0, s.length() - 1)) + changed;
        } else {
            changed += s.charAt(s.length() - 1);
            return changeXToY(s.substring(0, s.length() - 1)) + changed;
        }
    }
}