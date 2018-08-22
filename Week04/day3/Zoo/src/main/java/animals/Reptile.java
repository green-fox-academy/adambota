package main.java.animals;

public class Reptile extends Animal {
    public Reptile(String name) {
        this.name = name;
    }

    @Override
    public String breed() {
        return "laying eggs";
    }
}
