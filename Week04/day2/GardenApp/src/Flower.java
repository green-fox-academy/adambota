class Flower extends Plant {
    Flower(String color, double waterLevel) {
        this.color = color;
        this.waterLevel = waterLevel;
        this.waterThreshold = 5;
        this.waterAbsorption = 0.75;
        this.type = "flower";
    }
}
