package faf;

import static org.junit.Assert.*;

import org.junit.Test;

import Laba2.Random;

public class Rndtest {

    int i = Random.Rnd();

    @Test
    public void test() {
        assertTrue((i >= 1) && (i <= 20));
    }

}