package org.anefdef;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasinoTest {
    Casino casino = new Casino();

    @Test
    public void testMinCountGame_1Winning1Doublings_0Games() {
        assertEquals(0, casino.getStepsValue(1, 1));
    }

    @Test
    public void testMinCountGame_2Winning0Doublings_1Games() {
        assertEquals(1, casino.getStepsValue(2, 0));
    }

    @Test
    public void testMinCountGame_2Winning1Doublings_1Games() {
        assertEquals(1, casino.getStepsValue(2, 1));
    }

    @Test
    public void testMinCountGame_2Winning2Doublings_1Games() {
        assertEquals(1, casino.getStepsValue(2, 2));
    }

    @Test
    public void testMinCountGame_7Winning2Doublings_4Games() {
        assertEquals(4, casino.getStepsValue(7, 2));
    }

    @Test
    public void testMinCountGame_8Winning1Doublings_4Games() {
        assertEquals(4, casino.getStepsValue(8, 1));
    }

    @Test
    public void testMinCountGame_31Winning4Doublings_8Games() {
        assertEquals(8, casino.getStepsValue(31, 4));
    }

    @Test
    public void testMinCountGame_31Winning3Doublings_8Games() {
        assertEquals(8, casino.getStepsValue(31, 3));
    }

    @Test
    public void testMinCountGame_31Winning2Doublings_10Games() {
        assertEquals(10, casino.getStepsValue(31, 2));
    }
}
