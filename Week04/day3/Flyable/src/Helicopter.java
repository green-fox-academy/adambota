public class Helicopter extends Vehicle implements Flyable {
    public Helicopter(String color, int weight, boolean isLiving) {
        this.color = color;
        this.weight = weight;
        this.isLiving = isLiving;
    }

    @Override
    public void land() {
        System.out.println("Helicopter landing");
    }

    @Override
    public void fly() {
        System.out.println("Helicopter flying");
    }

    @Override
    public void takeOff() {
        System.out.println("Helicopter taking off");
    }
}
