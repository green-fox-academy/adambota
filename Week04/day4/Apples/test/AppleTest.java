import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

    @Test
    public void getApple() {
        Apple a = new Apple();
        assertEquals(a.getApple(), "apple");
    }
}