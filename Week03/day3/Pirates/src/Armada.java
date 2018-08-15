import java.util.ArrayList;
import java.util.List;

public class Armada {
    List<Ship> ships = new ArrayList<>();

    public void fillArmada() {
        for (int i = 0; i < 10; i++) {
            this.ships.add(new Ship());
            this.ships.get(i).fillShip();
        }
    }

    public boolean war(Armada armada) {
        return false;
    }
}
