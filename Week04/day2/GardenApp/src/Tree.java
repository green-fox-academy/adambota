class Tree extends Plant {
    Tree(String color, double waterLevel) {
        this.color = color;
        this.waterLevel = waterLevel;
        this.waterThreshold = 10;
        this.waterAbsorption = 0.4;
        this.type = "tree";
    }
}
