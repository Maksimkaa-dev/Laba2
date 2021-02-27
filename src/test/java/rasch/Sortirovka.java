package rasch;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Laba2.Mass;
import Laba2.Sort;

public class Sortirovka {

    static int[] m;
    static Mass n;

    @BeforeClass
    public static void test1() {
        n = new Mass();
        m = new int[n.massiv.length];
        for (int i = 0; i < n.massiv.length; i++) {
            m[i] = n.massiv[i];
        }

    }

    @Test
    public void test() {
        Sort.sort(m);
    }

    @AfterClass
    public static void test2() {

        for (int i = 2; i < m.length; i++) {
            assertTrue (m[i - 1] <= m[i]);
        }

    }
}