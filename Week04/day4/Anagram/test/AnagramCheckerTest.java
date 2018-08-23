import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramCheckerTest {

    @Test
    public void checkAnagram() {
        assertTrue(AnagramChecker.checkAnagram("dog", "god"));
    }
}