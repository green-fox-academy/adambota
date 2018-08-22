package main.java.music;

public class Violin extends StringedInstrument {
    public Violin() {
        numberOfStrings = 4;
    }

    public Violin(int strings) {
        numberOfStrings = strings;
    }


    @Override
    void sound() {
        System.out.println(numberOfStrings + " strings, Screech");
    }
}
