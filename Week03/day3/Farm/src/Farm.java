import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animal> animals = new ArrayList<>();
    int slots;

    public Animal breed() {
        if (this.slots > 0) return new Animal();
        else return null;
    }

    public void slaughter() {
        int max = 0;
        for (Animal animal : animals) {
            if (animal.hunger > max) max = animal.hunger;
        }
        for (Animal animal : animals) {
            if (animal.hunger == max) animals.remove(animal);
        }
    }
}
