package main.java.music;

public abstract class StringedInstrument extends Instrument {
    int numberOfStrings;

    public void play() {
        sound();
    }
}
