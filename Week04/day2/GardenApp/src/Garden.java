import java.util.ArrayList;
import java.util.List;

class Garden {
    List<Plant> garden;

    Garden() {
        garden = new ArrayList<>();
    }

    void addPlant(Plant plant) {
        this.garden.add(plant);
    }

    void printInfo() {
        for (Plant plant : garden) {
            if (plant.waterLevel < plant.waterThreshold) {
                System.out.println("The " + plant.color + " " + plant.type + " needs water!");
            } else {
                System.out.println("The " + plant.color + " " + plant.type + " doesn't need water.");
            }
        }
        System.out.println();
    }

    void waterPlants(int amount) {
        System.out.println("Watering with " + amount);
        int thirstyPlants = 0;
        for (Plant plant : this.garden) {
            if (plant.waterLevel < plant.waterThreshold) {
                thirstyPlants++;
            }
        }
        amount /= thirstyPlants;
        for (Plant plant : this.garden) {
            if (plant.waterLevel < plant.waterThreshold) {
                plant.water(amount);
            }
        }
    }
}
