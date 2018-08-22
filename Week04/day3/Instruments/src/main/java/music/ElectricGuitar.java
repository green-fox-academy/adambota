package main.java.music;

public class ElectricGuitar extends StringedInstrument {
    public ElectricGuitar() {
        numberOfStrings = 6;
    }

    public ElectricGuitar(int strings) {
        numberOfStrings = strings;
    }


    @Override
    void sound() {
        System.out.println(numberOfStrings + " strings, Twang");
    }
}
