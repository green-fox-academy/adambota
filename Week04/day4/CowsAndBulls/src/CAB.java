import java.util.*;

public class CAB {
    int[][] number;
    boolean isFinished;
    int guesses;
    private static Scanner sc = new Scanner(System.in);
    private static Random rnd = new Random();

    public CAB() {
        number = new int[4][2];
        isFinished = false;
        guesses = 0;
    }

    public void play() {
        generateNumber();
        while (!isFinished) {
            String guess;
            guesses++;
            System.out.println("Make your " + guesses + ". guess!");
            guess = sc.nextLine();
            fillInGuess(guess);
            print();
        }
        System.out.println("Congratulations!");
    }

    private void generateNumber() {
        number[0][0] = rnd.nextInt(9) + 1;
        number[1][0] = rnd.nextInt(10);
        number[2][0] = rnd.nextInt(10);
        number[3][0] = rnd.nextInt(10);
    }

    private void fillInGuess(String string) {
        number[0][1] = Character.getNumericValue(string.charAt(0));
        number[1][1] = Character.getNumericValue(string.charAt(1));
        number[2][1] = Character.getNumericValue(string.charAt(2));
        number[3][1] = Character.getNumericValue(string.charAt(3));
    }

    private void print() {
        String string = "";
        for (int i = 0; i < 4; i++) {
            if (number[i][0] == number[i][1]) string += "cow ";
            else string += "bull ";
        }
        System.out.println(string);
        if (string.equals("cow cow cow cow ")) isFinished = true;
    }
}
