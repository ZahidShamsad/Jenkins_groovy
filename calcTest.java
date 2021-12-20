package Pack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calcTest {

    @Test
    void testsum() {
        Calc ob = new Calc();
        assertEquals(8, ob.sum(5, 3));
    }

    @Test
    void testsub() {
        Calc ob = new Calc();
        assertEquals(2, ob.sub(5, 3));
    }

    @Test
    void testmul() {
        Calc ob = new Calc();
        assertEquals(15, ob.mul(5, 3));
    }

    @Test
    void testdiv() {
        Calc ob = new Calc();
        assertEquals(3, ob.div(15, 5));
    }

}