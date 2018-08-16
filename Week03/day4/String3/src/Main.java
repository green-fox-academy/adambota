public class Main {

    public static void main(String[] args) {
        // Given a string, compute recursively a new string where all the
        // adjacent chars are now separated by a "*".
        System.out.println(changeXToY("csillagok"));
    }

    public static String changeXToY(String s) {
        String changed = "";
        if (s.length() == 1) {
            changed += s.charAt(0);
            changed += "*";
            return changed;
        } else {
            changed += s.charAt(s.length() - 1);
            changed += "*";
            return changeXToY(s.substring(0, s.length() - 1)) + changed;
        }
    }
}