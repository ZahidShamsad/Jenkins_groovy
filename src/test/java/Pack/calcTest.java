package Pack;

//commenting for git status to recognize this.

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.calcTest;

class calcTest {

    @Test
    void testsum() {
        calc ob = new calc();
        assertEquals(8, ob.sum(5, 3));
    }

    @Test
    void testsub() {
        calc ob = new calc();
        assertEquals(2, ob.sub(5, 3));
    }

    @Test
    void testmul() {
        calc ob = new calc();
        assertEquals(15, ob.mul(5, 3));
    }

    @Test
    void testdiv() {
        calc ob = new calc();
        assertEquals(3, ob.div(15, 5));
    }

}