import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumClassTest {

    @Test
    public void sumTest() {
        SumClass s = new SumClass();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertEquals(s.sum(list), 21);
    }

    @Test
    public void testEmpty() {
        SumClass s = new SumClass();
        ArrayList<Integer> list = new ArrayList<>();
        assertEquals(s.sum(list), 0);
    }

    @Test
    public void testOneElement() {
        SumClass s = new SumClass();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        assertEquals(s.sum(list), 1);
    }

    @Test
    public void testNull() {
        SumClass s = new SumClass();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(null);
        assertEquals(s.sum(list), null);
    }
}