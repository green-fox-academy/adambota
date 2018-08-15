import java.util.Arrays;

public class DiceSet {
    // You have a `DiceSet` class which has a list for 6 dices
// You can roll all of them with roll()
// Check the current rolled numbers with getCurrent()
// You can reroll with reroll()
// Your task is to roll the dices until all of the dices are 6
    int[] dices = new int[6];

    public int[] roll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
        return dices;
    }

    public int[] getCurrent() {
        return dices;
    }

    public int getCurrent(int i) {
        return dices[i];
    }

    public void reroll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
    }

    public void reroll(int k) {
        dices[k] = (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        DiceSet diceSet = new DiceSet();
        int sum = 0;
        diceSet.roll();
        do {
            sum = 0;
            if (diceSet.dices[0] != 6) {
                diceSet.reroll(0);
            }
            if (diceSet.dices[1] != 6) {
                diceSet.reroll(1);
            }
            if (diceSet.dices[2] != 6) {
                diceSet.reroll(2);
            }
            if (diceSet.dices[3] != 6) {
                diceSet.reroll(3);
            }
            if (diceSet.dices[4] != 6) {
                diceSet.reroll(4);
            }
            if (diceSet.dices[5] != 6) {
                diceSet.reroll(5);
            }
            for (int i = 0; i < diceSet.dices.length; i++) {
                sum += diceSet.getCurrent(i);
            }
        } while (sum != 36);
        diceSet.getCurrent();
        diceSet.roll();
        diceSet.getCurrent();
        diceSet.getCurrent(5);
        diceSet.reroll();
        diceSet.getCurrent();
        diceSet.reroll(4);
        diceSet.getCurrent();
    }
}