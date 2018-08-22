package main.java.music;

public class BassGuitar extends StringedInstrument {
    public BassGuitar() {
        numberOfStrings = 4;
    }

    public BassGuitar(int strings) {
        numberOfStrings = strings;
    }

    @Override
    void sound() {
        System.out.println(numberOfStrings + " strings, Duum-duum-duum");
    }
}
