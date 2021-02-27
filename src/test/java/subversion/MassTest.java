package subversion;

import Laba2.Mass;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class MassTest {
    static Mass m;
    @BeforeClass
    public static void test1() {
        m = new Mass();
    }

    @Test
    public void test() {
        assertEquals(7, m.massiv.length);
        for (int i = 1; i < m.massiv.length; i++){
        assertNotNull(m.massiv[i]);
        }

    }

}
