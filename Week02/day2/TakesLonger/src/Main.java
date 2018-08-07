public class Main {

    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        StringBuilder builder = new StringBuilder();
        builder.append(quote.substring(0, 21));
        builder.append("always takes longer than");
        builder.append(quote.substring(20, quote.length()));
        quote = builder.toString();
        System.out.println(quote);
    }
}
