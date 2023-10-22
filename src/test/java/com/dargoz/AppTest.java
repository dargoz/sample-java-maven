package com.dargoz;

import org.junit.Test;

import static org.junit.Assert.*;

import com.dargoz.model.Calculation;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testApp() {
        assertTrue(true);
    }

    @Test
    public void testSum() {
        assertEquals(5, Calculation.sum(3, 2));
    }

    @Test 
    public void testMultiply() {
        assertEquals(9, Calculation.multiply(3, 3));
    }
}
