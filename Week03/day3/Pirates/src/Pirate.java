import java.util.*;

public class Pirate {
    Random rnd = new Random();
    int intoxication;
    boolean isDead;
    boolean isPassedOut;

    public void drinkSomeRum() {
        if (this.isDead) System.out.println("He's dead");
        this.intoxication++;
    }

    public void howsItGoingMate() {
        if (this.isDead) System.out.println("He's dead");
        else if (this.intoxication < 4) System.out.println("Pour me anudder!");
        else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            this.isPassedOut = true;
            this.intoxication = 0;
        }
    }

    public void die() {
        this.isDead = true;
    }

    public void brawl(Pirate enemy) {
        if (!enemy.isDead) {
            int outcome = rnd.nextInt(3);
            if (outcome == 0) enemy.die();
            else if (outcome == 1) this.die();
            else if (outcome == 2) {
                this.isPassedOut = true;
                enemy.isPassedOut = true;
            }
        }
    }

}
