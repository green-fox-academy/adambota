public class Gnirts implements CharSequence {
    private String string;

    Gnirts(String string) {
        this.string = string;
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        return string.charAt(string.length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        String subString = "";
        for (int i = 0; i < end - start; i++) {

        }
        return string.substring(string.length() - end, string.length() - start);
    }
}
