class Plant {
    String color;
    double waterLevel;
    int waterThreshold;
    double waterAbsorption;
    String type;

    void water(int amount) {
        this.waterLevel += amount * waterAbsorption;
    }
}
