import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Ship {
    Random rnd = new Random();
    List<Pirate> crew = new ArrayList<>();
    Pirate captain;

    public void fillShip() {
        this.captain = new Pirate();
        int number = 20 + rnd.nextInt(11);
        for (int i = 0; i < number; i++) {
            crew.add(new Pirate());
        }
    }

    public void printInfo() {
        System.out.println("The captain drank: " + this.captain.intoxication + " times. Is he alive: " + !this.captain.isDead + " Is he passed out: " + this.captain.isPassedOut);
        int count = 0;
        for (Pirate pirate : this.crew) {
            if (!pirate.isDead) count++;
        }
        System.out.println("Crew members alive: " + count);
    }

    public boolean battle(Ship enemy) {
        int ownAlive = 0;
        int enemyAlive = 0;
        for (Pirate pirate : this.crew) {
            if (!pirate.isDead) ownAlive++;
        }
        for (Pirate pirate : enemy.crew) {
            if (!pirate.isDead) enemyAlive++;
        }
        int ownScore = ownAlive - this.captain.intoxication;
        int enemyScore = enemyAlive - enemy.captain.intoxication;
        boolean enemyWon = enemyScore > ownScore;
        if (enemyWon) {
            for (Pirate pirate : this.crew) {
                pirate.isDead = rnd.nextInt(2) < 1;
            }
            enemy.captain.intoxication += rnd.nextInt(5);
            for (Pirate pirate : enemy.crew) {
                pirate.intoxication += rnd.nextInt(5);
            }
        } else if (!enemyWon) {
            for (Pirate pirate : enemy.crew) {
                pirate.isDead = rnd.nextInt(2) < 1;
            }
            this.captain.intoxication += rnd.nextInt(5);
            for (Pirate pirate : this.crew) {
                pirate.intoxication += rnd.nextInt(5);
            }
        }
        return !enemyWon;
    }
}
