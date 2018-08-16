public class Main {

    public static void main(String[] args) {
        // Given a string, compute recursively (no loops) a new string where all the
        // lowercase 'x' chars have been changed to 'y' chars.
        System.out.println(changeXToY("xyxasdxyxyx"));
    }

    public static String changeXToY(String s) {
        String changed = "";
        if (s.length() == 0) {
            return "";
        } else if (s.length() == 1 && s.charAt(0) == 'x') {
            changed += 'y';
            return changed;
        } else if (s.length() == 1) {
            changed += s.charAt(0);
            return changed;
        } else if (s.charAt(s.length() - 1) == 'x') {
            changed += 'y';
            return changeXToY(s.substring(0, s.length() - 1)) + changed;
        } else {
            changed += s.charAt(s.length() - 1);
            return changeXToY(s.substring(0, s.length() - 1)) + changed;
        }
    }
}