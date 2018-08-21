import java.util.ArrayList;
import java.util.List;

class Carrier {
    private List<Aircraft> aircrafts;
    private int ammoStored;
    private int health;

    public Carrier(int ammoStored, int health) {
        aircrafts = new ArrayList<>();
        this.ammoStored = ammoStored;
        this.health = health;
    }

    void add(Aircraft aircraft) {
        this.aircrafts.add(aircraft);
    }

    void fill() {
        if (ammoStored <= 0) throw new IllegalArgumentException();
        for (Aircraft aircraft : aircrafts) {
            ammoStored = aircraft.refill(ammoStored);
        }
    }

    void fight(Carrier enemy) {
        int damageDealt = 0;
        for (Aircraft aircraft : this.aircrafts) {
            damageDealt += aircraft.fight();
        }
        enemy.health -= damageDealt;
    }

    String getStatus() {
        if (health <= 0) return "It's dead Jim :(";
        else {
            String status = "HP: " + health + ", Aircraft Count: " + aircrafts.size() + ", Ammo Storage: " + ammoStored + ", Total damage: " + totalDamage() + "\nAircrafts:";
            for (Aircraft aircraft : aircrafts) {
                int allDamage = aircraft.ammoLeft * aircraft.damage;
                status += "\n" + aircraft.getStatus();
            }
            return status;
        }
    }

    private int totalDamage() {
        int totalDamage = 0;
        for (Aircraft aircraft : this.aircrafts) {
            totalDamage += aircraft.ammoLeft * aircraft.damage;
        }
        return totalDamage;
    }
}
