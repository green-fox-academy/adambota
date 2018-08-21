public class Main {

    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.addPlant(new Flower("yellow", 4));
        garden.addPlant(new Flower("blue", 3));
        garden.addPlant(new Tree("purple", 0));
        garden.addPlant(new Tree("orange", 0));
        garden.printInfo();
        garden.waterPlants(40);
        garden.printInfo();
        garden.waterPlants(70);
        garden.printInfo();
    }
}
