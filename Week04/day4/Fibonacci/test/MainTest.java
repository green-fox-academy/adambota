import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void fibonacci() {
        assertEquals(Main.fibonacci(4), 2);
    }
}