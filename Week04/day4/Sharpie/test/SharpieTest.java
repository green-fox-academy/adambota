import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {
    Sharpie s;

    @Test
    public void use() {
        s = new Sharpie("green", 5);
        s.use();
        assertEquals(s.inkAmount, 99);
    }

    @Test
    public void color() {
        s = new Sharpie("blue", 2);
        assertTrue(s.color == "blue");
    }
}