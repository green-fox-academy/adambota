public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String todoText = " - Buy milk\n";
        sb.append("My todo:\n");
        sb.append(todoText);
        sb.append(" - Download games\n");
        sb.append("\t - Diablo");
        todoText = sb.toString();
        System.out.println(todoText);
    }
}
