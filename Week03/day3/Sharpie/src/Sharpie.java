public class Sharpie {
    String color;
    double width;
    double inkAmount;

    public Sharpie(String color, double width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }

    public void use() {
        this.inkAmount--;
    }
}
