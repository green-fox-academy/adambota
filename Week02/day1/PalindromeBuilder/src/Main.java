public class Main {

    public static void main(String[] args) {
        System.out.println(palindromeBuilder("greenfox"));
    }

    private static String palindromeBuilder(String s) {
        String palindrome = s;
        for (int i = 0; i < s.length(); i++) {
            palindrome += s.charAt(s.length() - i - 1);
        }
        return palindrome;
    }
}