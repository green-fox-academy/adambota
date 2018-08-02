public class Main {

    public static void main(String[] args) {
        String line = "% % % % ";
        for (int i = 0; i < 8; i++) {
            if((i % 2) == 0) System.out.println(line);
            else if((i % 2) != 0) {
                System.out.println(" " + line);
            }
        }
    }
}
