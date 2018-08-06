public class Main {

    public static void main(String[] args) {
        System.out.println(anagramChecker("dog", "god"));
    }

    private static boolean anagramChecker(String a, String b) {
        boolean isAnagram = false;
        if (a.length() != b.length()){
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (b.contains(Character.toString(a.charAt(i)))) {
                isAnagram = true;
            } else {
                isAnagram = false;
            }
        }
        return isAnagram;
    }
}