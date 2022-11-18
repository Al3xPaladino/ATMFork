package test.Business_Logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import code.Business_Logic.Euro;

public class EuroTest {
    @Test
    public void testGetValore() {
        Euro example = new Euro(42f);
        assertEquals(4200, example.getValore());
    }

    @Test
    public void testMinoreDi() {
        Euro ex1 = new Euro(42f);
        Euro ex2 = new Euro(45f);

        assertTrue(ex1.minoreDi(ex2));
    }

    @Test
    public void testSomma() {
        Euro example = new Euro(42f);
        example.somma(example);

        assertEquals(example.getValore(), 8400);
    }

    @Test
    public void testSottrai() {
        Euro example = new Euro(42f);
        example.sottrai(example);

        assertEquals(example.getValore(), 0);
    }

    @Test
    public void testStampa() {
        Euro example = new Euro(42f);
        
        assertEquals(example.stampa(), "42.0 euro");
    }

    @Test
    public void testUgualeA() {
        Euro ex1 = new Euro(42f);
        Euro ex2 = new Euro(42.3f);

        assertFalse(ex1.equals(ex2));
    }
}
