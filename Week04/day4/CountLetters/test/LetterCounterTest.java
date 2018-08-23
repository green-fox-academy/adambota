import org.junit.Test;

import static org.junit.Assert.*;

public class LetterCounterTest {

    @Test
    public void countLetters() {
        LetterCounter lc = new LetterCounter();
        int numberOfA = lc.countLetters("aababcde").get('a');
        assertEquals(numberOfA, 3);
    }
}