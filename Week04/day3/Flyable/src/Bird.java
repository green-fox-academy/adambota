public class Bird extends Animal implements Flyable {
    public Bird(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String breed() {
        return "breeding by laying eggs";
    }

    @Override
    public void land() {
        System.out.println("Bird landing");
    }

    @Override
    public void fly() {
        System.out.println("Bird flying");
    }

    @Override
    public void takeOff() {
        System.out.println("Bird taking off");
    }
}
